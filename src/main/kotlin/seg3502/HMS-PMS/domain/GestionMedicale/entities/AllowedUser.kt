package seg3502.`HMS-PMS`.domain.GestionMedicale.entities

import seg3502.hmspms.domain.user.entities.UserAccountRole
import java.util.UUID

class AllowedUser (
    val id: UUID,
    val employeeNumber: Int,
    val role: UserAccountRole
) {

}