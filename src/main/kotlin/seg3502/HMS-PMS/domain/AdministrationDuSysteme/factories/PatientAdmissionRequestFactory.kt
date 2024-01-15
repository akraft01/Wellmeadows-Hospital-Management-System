package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.factories


import seg3502.hmspms.application.dtos.queries.RequestPatientAdmissionDto
import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities.PatientAdmissionRequest
import java.util.*

interface PatientAdmissionRequestFactory {
    fun requestPatientAdmission(patientId: UUID, admitPatientDto: RequestPatientAdmissionDto): PatientAdmissionRequest
}