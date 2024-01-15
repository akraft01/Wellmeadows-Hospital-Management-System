package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.factories


import seg3502.hmspms.application.dtos.queries.AdmitPatientDto
import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities.DivisionPatient
import java.util.*

interface DivisionPatientFactory {
    fun createDivisionPatient(patientId: UUID, admitPatientDto: AdmitPatientDto): DivisionPatient
}