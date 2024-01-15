package seg3502.`HMS-PMS`.domain.GestionPatients.repositories


interface ReceptionistRepository {
    fun findById(receptionistId: Int): Receptionist?
    fun save(receptionist: Receptionist)
}

