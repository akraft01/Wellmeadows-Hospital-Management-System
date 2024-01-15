package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.repositories

import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities.Division
import java.util.*

interface DivisionRepository {
    fun find(divisionId: UUID): Division?
    fun findAll(): List<Division>
    fun save(division: Division): Division
}