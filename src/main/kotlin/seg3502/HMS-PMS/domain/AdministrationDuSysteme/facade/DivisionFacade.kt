package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.facade

import seg3502.hmspms.application.dtos.queries.AdmitPatientDto
import seg3502.hmspms.application.dtos.queries.AdmitPatientFromRequestDto
import seg3502.hmspms.application.dtos.queries.NewDivisionDto
import seg3502.hmspms.application.dtos.queries.RequestPatientAdmissionDto
import java.util.UUID

interface DivisionFacade {
    fun newDivision(divisionInfo: NewDivisionDto): UUID
    fun admitPatient(patientId: UUID, divisionId: UUID, admitPatientDto: AdmitPatientDto): UUID?
    fun requestPatientAdmission(patientId: UUID, divisionId: UUID, requestPatientAdmissionInfo: RequestPatientAdmissionDto): Boolean
    fun admitPatientFromRequestList(divisionId: UUID, admitPatientFromRequestInfo: AdmitPatientFromRequestDto): UUID?
    fun dischargePatient(divisionId: UUID, patientId: UUID): Boolean
}