package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities

import java.util.*

class DivisionPatient(
    val id: UUID,
    val patientId: UUID,
    val localDoctor: String,
    val roomNumber: String,
    val bedNumber: String,
    val privateInsuranceNumber: String
)