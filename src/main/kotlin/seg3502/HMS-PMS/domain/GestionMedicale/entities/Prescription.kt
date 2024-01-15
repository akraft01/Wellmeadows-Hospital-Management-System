package seg3502.`HMS-PMS`.domain.GestionMedicale.entities

class Prescription(
    val prescriptionId: Int,
    var drugName: String,
    var dosage: String,
    var frequency: String
) {
    fun createPrescription() {
        // Logique pour créer une nouvelle prescription
    }

    fun modifyPrescription() {
        // Logique pour modifier une prescription existante
    }
}

