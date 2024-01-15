package seg3502.`HMS-PMS`.domain.GestionPatients.entities

data class Receptionist(
    val receptionistId: Int,
    var name: String
) {
    fun registerPatient(patient: Patient) {
        // Logique pour enregistrer un patient via le service de patients
    }

    fun scheduleAppointments(patient: Patient) {
        // Logique pour planifier des rendez-vous pour un patient
    }
}

