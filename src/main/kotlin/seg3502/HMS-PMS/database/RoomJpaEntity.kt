package seg3502.`HMS-PMS`.entities.division

import jakarta.persistence.*
import java.util.*

@Entity()
@Table(name="rooms")
class RoomJpaEntity(@Id val id: String,
                    val location: String,
                    val numberOfBeds: Number
) {
    @ElementCollection
    @CollectionTable(name="rooms_beds",
        joinColumns= [JoinColumn(name = "room_id")])
    val beds: MutableList<UUID> = ArrayList()
}