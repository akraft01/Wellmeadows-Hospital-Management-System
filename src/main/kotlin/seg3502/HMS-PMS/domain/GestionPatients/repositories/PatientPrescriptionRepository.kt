package seg3502.`HMS-PMS`.domain.GestionPatients.repositories


import java.util.*

interface PatientPrescriptionRepository {
    fun find(prescriptionId: UUID): Prescription?
    fun save(prescription: Prescription): Prescription
}