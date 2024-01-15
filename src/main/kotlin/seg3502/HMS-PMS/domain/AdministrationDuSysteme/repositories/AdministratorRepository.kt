package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.repositories

import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities.Administrator


interface AdministratorRepository {
    fun save(administrator: Administrator): Administrator
    // Other CRUD operations
}

