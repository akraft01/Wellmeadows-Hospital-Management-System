package seg3502.`HMS-PMS`.domain.GestionPatients.entities


import seg3502.hmspms.domain.patient.factories.PatientPrescriptionFactory
import seg3502.`HMS-PMS`.domain.GestionPatients.repositories.PatientPrescriptionRepository
import java.util.*

class Patient (
    val id: UUID,
    val sinNumber: Int,
    val firstName: String,
    val lastName: String,
    val address: String,
    val phoneNumber: String,
    val dateOfBirth: Date,
    val gender: String,
    val maritalStatus: String,
    val doctor: String,
    val patientNextToKin: PatientNextToKin
) {
    val prescriptions: MutableList<UUID> = ArrayList()

    fun prescribeMedication(prescriptionInformation: PrescribeMedicationDto, patientPrescriptionFactory: PatientPrescriptionFactory, patientPrescriptionRepository: PatientPrescriptionRepository): UUID? {
        val newPrescription = patientPrescriptionFactory.prescribeMedication(prescriptionInformation, UUID.randomUUID())
        prescriptions.add(newPrescription.id)
        patientPrescriptionRepository.save(newPrescription)
        return newPrescription.id
    }
}