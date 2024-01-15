package seg3502.`HMS-PMS`.entities.division

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity()
@Table(name="admission_requests")
class PatientAdmissionRequestJpaEntity(@Id val id: String,
                                       val patientId: UUID,
                                       val rationalForRequest: String,
                                       val priorityAssessment: Number,
                                       val localDoctor: String
) {

}