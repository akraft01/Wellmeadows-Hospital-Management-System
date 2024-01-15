package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities

import java.util.*

class Room (
    val id: UUID,
    val location: String,
    val numberOfBeds: Number
) {
    val beds: MutableList<UUID> = ArrayList()
}