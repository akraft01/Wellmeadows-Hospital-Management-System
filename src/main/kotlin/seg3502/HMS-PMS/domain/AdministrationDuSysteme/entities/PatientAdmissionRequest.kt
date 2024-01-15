package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities

import java.util.*

class PatientAdmissionRequest (
    val id: UUID,
    val patientId: UUID,
    val rationalForRequest: String,
    val priorityAssessment: Number,
    val localDoctor: String
)