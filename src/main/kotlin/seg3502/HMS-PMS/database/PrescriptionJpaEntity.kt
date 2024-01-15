package seg3502.`HMS-PMS`.entities.patient

import jakarta.persistence.*
import java.util.*

@Entity()
@Table(name="prescriptions")
class PrescriptionJpaEntity(@Id val id: UUID,
                            val drugNumber: String,
                            val drugName: String,
                            val unitsPerDay: Int,
                            val numberOfAdministrationPerDay: Int,
                            val methodOfAdministration: String,
                            val startDate: Date,
                            val endDate: Date,
) {
    @ElementCollection
    @CollectionTable(name="prescriptions_administration_times",
        joinColumns= [JoinColumn(name = "prescription_id")])
    val prescriptionTimes: MutableList<UUID> = ArrayList()
}