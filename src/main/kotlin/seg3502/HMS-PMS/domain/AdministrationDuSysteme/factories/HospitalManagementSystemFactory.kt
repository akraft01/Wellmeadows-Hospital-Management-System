package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.factories


import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities.HospitalManagementSystem


object HospitalManagementSystemFactory {
    fun create(systemId: Int, name: String): HospitalManagementSystem {
        return HospitalManagementSystem(systemId, name)
    }
}

