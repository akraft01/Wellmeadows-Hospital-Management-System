package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.repositories

import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities.Bed
import java.util.*

interface DivisionBedRepository {

    fun find(id: UUID): Bed?
    fun findByBedNumber(bedNumber: String): Bed?
    fun save(bed: Bed): Bed
}