package seg3502.`HMS-PMS`.entities.user

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import seg3502.hmspms.domain.user.entities.UserAccountRole
import java.util.*

@Entity()
@Table(name="allowed_users")
class AllowedUserJpaEntity (
    @Id
    @Column(name = "id", columnDefinition = "UUID")
    val id: UUID,
    val employeeNumber: Int,
    val role: UserAccountRole
) {
}