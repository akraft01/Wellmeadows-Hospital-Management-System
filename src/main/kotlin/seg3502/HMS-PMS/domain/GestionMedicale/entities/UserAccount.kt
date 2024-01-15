package seg3502.`HMS-PMS`.domain.GestionMedicale.entities

import java.util.UUID

enum class UserAccountRole {
    NURSE, DOCTOR, MEDICAL_DIRECTOR, PERSONNEL_OFFICER
}

class UserAccount (
    val id: UUID,
    val employeeNumber: Int,
    val firstName: String,
    val lastName: String,
    val email: String,
    val role: UserAccountRole
)