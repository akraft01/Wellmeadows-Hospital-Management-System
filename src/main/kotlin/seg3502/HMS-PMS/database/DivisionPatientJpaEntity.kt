package seg3502.`HMS-PMS`.entities.division

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity()
@Table(name="division_patients")
class DivisionPatientJpaEntity(@Id val id: String,
                               val localDoctor: String,
                               val roomNumber: String,
                               val bedNumber: String,
                               val privateInsuranceNumber: String
) {

}