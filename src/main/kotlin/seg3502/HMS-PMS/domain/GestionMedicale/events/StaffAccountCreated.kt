package seg3502.`HMS-PMS`.domain.GestionMedicale.events


import java.util.*

class StaffAccountCreated(val id: UUID,
                          val occuredOn: Date,
                          val userId: UUID): DomainEvent