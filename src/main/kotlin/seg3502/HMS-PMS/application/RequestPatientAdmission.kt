package seg3502.`HMS-PMS`.application


import java.util.*

interface RequestPatientAdmission {
    fun requestPatientAdmission(
        patientId: UUID,
        divisionId: UUID,
        requestPatientAdmissionInfo: RequestPatientAdmissionDto
    ): Boolean
}