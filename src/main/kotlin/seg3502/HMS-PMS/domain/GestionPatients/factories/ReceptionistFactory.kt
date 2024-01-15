package seg3502.`HMS-PMS`.domain.GestionPatients.factories




object ReceptionistFactory {
    fun createReceptionist(receptionistId: Int, name: String): Receptionist {
        require(name.isNotBlank()) { "Receptionist name cannot be blank." }
        return Receptionist(receptionistId, name)
    }
}

