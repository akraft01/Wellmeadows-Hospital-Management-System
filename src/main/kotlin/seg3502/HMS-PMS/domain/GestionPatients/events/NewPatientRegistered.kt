package seg3502.`HMS-PMS`.domain.GestionPatients.events


import java.util.*

class NewPatientRegistered(val id: UUID,
                           val occuredOn: Date,
                           val patientId: UUID): DomainEvent