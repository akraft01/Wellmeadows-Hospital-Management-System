package seg3502.`HMS-PMS`.entities.division

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity()
@Table(name="charge_nurses")
class ChargeNurseJpaEntity(@Id val id: UUID,
                   val name: String,
                   val employeeNumber: Int,
                   val telephoneExtension: Int,
                   val beeperExtension: Int
) {

}