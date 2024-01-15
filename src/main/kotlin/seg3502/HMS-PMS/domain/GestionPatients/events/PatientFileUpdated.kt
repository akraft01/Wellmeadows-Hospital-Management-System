package seg3502.`HMS-PMS`.domain.GestionPatients.events


import java.util.*

class PatientFileUpdated(val id: UUID,
                         val occuredOn: Date,
                         val patientId: UUID
): DomainEvent