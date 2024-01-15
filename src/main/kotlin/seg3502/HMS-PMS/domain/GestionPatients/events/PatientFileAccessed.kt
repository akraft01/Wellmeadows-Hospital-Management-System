package seg3502.`HMS-PMS`.domain.GestionPatients.events


import java.util.Date
import java.util.UUID

class PatientFileAccessed (
    val id: UUID,
    val occurredOn: Date,
    val userId: UUID
): DomainEvent {
}