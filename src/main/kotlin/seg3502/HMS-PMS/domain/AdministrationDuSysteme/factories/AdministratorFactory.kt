package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.factories

import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities.Administrator

object AdministratorFactory {
    fun createAdministrator(adminId: Int, name: String): Administrator {
        // Include logic to validate or prepare before creating an Administrator entity
        return Administrator(adminId, name)
    }
}

