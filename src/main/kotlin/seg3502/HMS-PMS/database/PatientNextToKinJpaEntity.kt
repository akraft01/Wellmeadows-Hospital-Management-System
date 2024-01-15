package seg3502.`HMS-PMS`.entities.patient

import jakarta.persistence.Embeddable

@Embeddable
class PatientNextToKinJpaEntity(val nextToKinFullName: String,
                                val nextToKinRelationshipToPatient: String,
                                val nextToKinAddress: String,
                                val nextToKinPhoneNumber: String
) {

}