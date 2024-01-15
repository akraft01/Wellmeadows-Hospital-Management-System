package seg3502.`HMS-PMS`.domain.GestionPatients.events


import java.util.*

class NewPatientPrescription(val id: UUID,
                              val occuredOn: Date,
                              val patientId: UUID
): DomainEvent