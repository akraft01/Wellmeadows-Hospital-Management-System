package seg3502.`HMS-PMS`.entities.division

import jakarta.persistence.*

@Entity()
@Table(name="beds")
class BedJpaEntity(@Id val id: String,
                   val bedNumber: String,
                   var isOccupied: Boolean
) {

}