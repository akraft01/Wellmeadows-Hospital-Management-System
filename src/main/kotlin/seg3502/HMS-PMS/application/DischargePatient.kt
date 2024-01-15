package seg3502.`HMS-PMS`.application

import java.util.UUID

interface DischargePatient {
    fun dischargePatient(
        divisionId: UUID,
        patientId: UUID
    ): Boolean
}