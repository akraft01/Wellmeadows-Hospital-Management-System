package seg3502.`HMS-PMS`.application


import java.util.*

interface RegisterPatient {
    fun registerPatient(patientInfo: RegisterPatientDto): UUID?
    fun updatePatient(id: UUID, patientInfo: RegisterPatientDto): Boolean
}