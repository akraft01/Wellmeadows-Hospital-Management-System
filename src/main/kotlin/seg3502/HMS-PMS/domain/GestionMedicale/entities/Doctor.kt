package seg3502.`HMS-PMS`.domain.GestionMedicale.entities

import seg3502.HMS.Prescription

class Doctor(
    val doctorId: Int,
    var name: String,
    var specialty: String
) {
    fun prescribeMedication(prescription: Prescription) {
        // Logique pour prescrire un médicament
    }

    fun updatePrescription(prescription: Prescription) {
        // Logique pour mettre à jour une prescription
    }
}

