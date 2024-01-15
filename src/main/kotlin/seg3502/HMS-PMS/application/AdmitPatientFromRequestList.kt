package seg3502.`HMS-PMS`.application


import java.util.*

interface AdmitPatientFromRequestList {
    fun admitPatientFromRequestList(
        divisionId: UUID, admitPatientFromRequestInfo: AdmitPatientFromRequestDto
    ): UUID?
}