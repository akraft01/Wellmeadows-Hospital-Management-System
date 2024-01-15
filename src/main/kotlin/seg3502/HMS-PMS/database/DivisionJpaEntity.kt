package seg3502.`HMS-PMS`.entities.division

import jakarta.persistence.*
import java.util.*

@Entity()
@Table(name="divisions")
class DivisionJpaEntity(@Id
                        @Column(name = "id", columnDefinition = "UUID")
                        val id: UUID,
                        val divisionIdentifier: String,
                        val divisionName: String,
                        val location: String,
                        val totalBeds: Int,
                        val phoneExtensionNumber: Int,
                        var isComplete: Boolean = false
) {
    @ElementCollection
    @CollectionTable(name="divisions_rooms",
        joinColumns= [JoinColumn(name = "division_id")])
    val rooms: MutableList<UUID> = ArrayList()

    @ElementCollection
    @CollectionTable(name="divisions_patients",
        joinColumns= [JoinColumn(name = "division_id")])
    val patients: MutableList<UUID> = ArrayList()

    @ElementCollection
    @CollectionTable(name="divisions_patient_admission_requests",
        joinColumns= [JoinColumn(name = "division_id")])
    val patientAdmissionRequests: MutableList<UUID> = ArrayList()
}