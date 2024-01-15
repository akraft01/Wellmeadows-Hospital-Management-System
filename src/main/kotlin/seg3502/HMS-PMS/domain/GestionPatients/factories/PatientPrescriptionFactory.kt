package seg3502.`HMS-PMS`.domain.GestionPatients.factories


import java.util.UUID

interface PatientPrescriptionFactory {
    fun prescribeMedication(prescribeMedicationInfo: PrescribeMedicationDto, id: UUID): Prescription
}