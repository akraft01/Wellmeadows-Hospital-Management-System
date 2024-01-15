package seg3502.`HMS-PMS`.entities.patient

import jakarta.persistence.*
import java.util.*

@Entity()
@Table(name="patients")
class PatientJpaEntity(
    @Id
                    @Column(name = "id", columnDefinition = "UUID")
                    val id: UUID,
    val sinNumber: Int,
    val firstName: String,
    val lastName: String,
    val address: String,
    val phoneNumber: String,
    val dateOfBirth: Date,
    val gender: String,
    val maritalStatus: String,
    val doctor: String,
    @Embedded
                    val patientNextToKin: PatientNextToKinJpaEntity,
) {
    @ElementCollection
    @CollectionTable(name="patient_prescriptions",
        joinColumns= [JoinColumn(name = "patientId")])
    val prescriptions: MutableList<UUID> = ArrayList()

    @ElementCollection
    @CollectionTable(name="patient_admission_requests",
        joinColumns= [JoinColumn(name = "patientId")])
    val patientAdmissionRequests: MutableList<UUID> = ArrayList()
}