package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities

import java.util.UUID

class ChargeNurse (
    val id: UUID,
    val employeeNumber: Int,
    val name: String,
    val telephoneExtension: Int,
    val beeperExtension: Int
)
