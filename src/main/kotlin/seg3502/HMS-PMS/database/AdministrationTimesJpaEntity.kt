package seg3502.`HMS-PMS`.entities.patient

import jakarta.persistence.Embeddable
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.sql.Time
import java.util.UUID

@Entity()
@Table(name="administration_times")
class AdministrationTimesJpaEntity (@Id val id: UUID,
                                  val units: Number,
                                  val timeOfDay: Time
) {
}