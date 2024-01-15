package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.factories


import seg3502.hmspms.application.dtos.queries.NewDivisionDto
import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities.Division

interface DivisionFactory {
    fun newDivision(divisionInfo: NewDivisionDto): Division
}