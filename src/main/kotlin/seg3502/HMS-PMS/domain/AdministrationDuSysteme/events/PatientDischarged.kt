package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.events
import seg3502.hmspms.domain.common.DomainEvent
import java.util.*

class PatientDischarged (val id: UUID,
                         val occuredOn: Date,
                         val divisionId: UUID
): DomainEvent