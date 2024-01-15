package seg3502.`HMS-PMS`.domain.GestionPatients.facade.implementation


import seg3502.`HMS-PMS`.domain.GestionPatients.factories.PatientFactory
import seg3502.hmspms.domain.patient.factories.PatientPrescriptionFactory
import seg3502.`HMS-PMS`.domain.GestionPatients.repositories.PatientPrescriptionRepository
import seg3502.hmspms.domain.patient.repositories.PatientRepository
import java.util.*

class PatientFacadeImpl (
    private var patientFactory: PatientFactory,
    private var patientRepository: PatientRepository,
    private var patientPrescriptionFactory: PatientPrescriptionFactory,
    private var patientPrescriptionRepository: PatientPrescriptionRepository,
    private var eventEmitter: DomainEventEmitter
): PatientFacade {

    override fun registerPatient(patientInfo: RegisterPatientDto): UUID {
        val patient = patientFactory.registerPatient(patientInfo)
        patientRepository.save(patient)
        eventEmitter.emit(NewPatientRegistered(UUID.randomUUID(), Date(), patient.id))
        return patient.id
    }

    override fun updatePatientFile(patientId: UUID, patientInfo: RegisterPatientDto): Boolean {
        val patient = patientFactory.updatePatientFile(patientId, patientInfo)
        patientRepository.save(patient)
        eventEmitter.emit(PatientFileUpdated(UUID.randomUUID(), Date(), patient.id))
        return true
    }

    override fun prescribeMedication(patientId: UUID, prescriptionInformation: PrescribeMedicationDto): Boolean {
        val patient = patientRepository.find(patientId)
        patient?.prescribeMedication(prescriptionInformation, patientPrescriptionFactory, patientPrescriptionRepository)
        return if (patient != null) {
            patientRepository.save(patient)
            val newPatientPrescriptionEvent = NewPatientPrescription(UUID.randomUUID(),
                Date(),
                patientId)
            eventEmitter.emit(newPatientPrescriptionEvent)
            true
        } else {
            false
        }
    }
}