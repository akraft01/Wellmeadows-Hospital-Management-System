package seg3502.`HMS-PMS`.application

import java.util.UUID

interface PrescribeMedication {
    fun prescribeMedication(
        patientId: UUID,
        prescriptionInformation: PrescribeMedicationDto
    ): Boolean
}