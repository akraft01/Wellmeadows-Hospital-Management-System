package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.repositories

import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities.DivisionPatient
import java.util.*

interface DivisionPatientRepository {
    fun find(patientId: UUID): DivisionPatient?
    fun save(divisionPatient: DivisionPatient): DivisionPatient
}