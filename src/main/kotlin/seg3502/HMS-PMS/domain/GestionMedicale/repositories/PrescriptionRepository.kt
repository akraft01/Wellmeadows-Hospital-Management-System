package seg3502.`HMS-PMS`.domain.GestionMedicale.repositories

import seg3502.hmspms.domain.patient.entities.Prescription


interface PrescriptionRepository {
    fun save(prescription: Prescription): Prescription
    // Ajouter d'autres méthodes si nécessaire
}

