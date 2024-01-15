package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.repositories

import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities.PatientAdmissionRequest
import java.util.UUID

interface PatientAdmissionRequestRepository {
    fun find(patientAdmissionRequestId: UUID): PatientAdmissionRequest?
    fun save(patientAdmissionRequest: PatientAdmissionRequest): PatientAdmissionRequest
}