package seg3502.`HMS-PMS`.domain.GestionPatients.entities

import seg3502.`HMS-PMS`.domain.GestionPatients.entities.AdministrationTimes
import java.util.*

class Prescription (
    val id: UUID,
    val drugNumber: String,
    val drugName: String,
    val unitsPerDay: Int,
    val numberOfAdministrationPerDay: Int,
    val administrationTimes: List<AdministrationTimes>,
    val methodOfAdministration: String,
    val startDate: Date,
    val endDate: Date
)