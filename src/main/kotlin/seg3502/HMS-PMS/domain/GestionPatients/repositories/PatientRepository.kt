package seg3502.`HMS-PMS`.domain.GestionPatients.repositories


import java.util.UUID

interface PatientRepository {
    fun find(patientId: UUID): Patient?
    fun findAll(): List<Patient>
    fun save(patient: Patient): Patient
}