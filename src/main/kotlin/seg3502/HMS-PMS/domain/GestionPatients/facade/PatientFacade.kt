package seg3502.`HMS-PMS`.domain.GestionPatients.facade

import java.util.*

interface PatientFacade {
    fun registerPatient(patientInfo: RegisterPatientDto): UUID
    fun updatePatientFile(patientId: UUID, patientInfo: RegisterPatientDto): Boolean
    fun prescribeMedication(patientId: UUID, prescriptionInformation: PrescribeMedicationDto): Boolean
}