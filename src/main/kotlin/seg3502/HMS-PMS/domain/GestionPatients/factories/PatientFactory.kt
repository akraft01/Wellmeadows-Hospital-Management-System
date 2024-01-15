package seg3502.`HMS-PMS`.domain.GestionPatients.factories


import java.util.*

interface PatientFactory {
    fun registerPatient(patientInfo: RegisterPatientDto): Patient
    fun updatePatientFile(patientId: UUID, patientInfo: RegisterPatientDto): Patient
}