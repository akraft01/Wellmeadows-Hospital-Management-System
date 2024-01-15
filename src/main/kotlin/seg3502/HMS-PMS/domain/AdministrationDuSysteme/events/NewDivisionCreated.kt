package seg3502.hmspms.domain.division.events

import seg3502.hmspms.domain.common.DomainEvent
import java.util.*

class NewDivisionCreated (val id: UUID,
                          val occuredOn: Date,
                          val divisionId: UUID
): DomainEvent