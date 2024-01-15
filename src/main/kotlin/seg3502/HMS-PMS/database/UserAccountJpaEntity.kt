package seg3502.`HMS-PMS`.entities.user

import java.util.*
import jakarta.persistence.*
import seg3502.hmspms.domain.user.entities.UserAccountRole

@Entity()
@Table(name="user_accounts")
class UserAccountJpaEntity(
                    @Id
                    @Column(name = "id", columnDefinition = "UUID")
                    val id: UUID,
                    val employeeNumber: Int,
                    val firstName: String,
                    val lastName: String,
                    val email: String,
                    val role: UserAccountRole
) {
    @ElementCollection
    @CollectionTable(name="users_prescriptions",
        joinColumns= [JoinColumn(name = "user_account_id")])
    val prescriptions: MutableList<UUID> = ArrayList()
}