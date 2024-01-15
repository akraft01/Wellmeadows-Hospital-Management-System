package seg3502.`HMS-PMS`.domain.GestionMedicale.repositories



interface DoctorRepository {
    fun save(doctor: Doctor): Doctor
    // Ajouter d'autres méthodes si nécessaire
}

