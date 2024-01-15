package seg3502.`HMS-PMS`.application


import java.util.UUID

interface AdmitPatient {
    fun admitPatient(divisionId: UUID, patientId: UUID, admitPatientInfo: AdmitPatientDto): UUID?
}