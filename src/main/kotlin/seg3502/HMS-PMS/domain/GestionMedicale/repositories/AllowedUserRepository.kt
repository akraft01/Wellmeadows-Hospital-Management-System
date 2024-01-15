package seg3502.`HMS-PMS`.domain.GestionMedicale.repositories

import seg3502.`HMS-PMS`.domain.GestionMedicale.entities.AllowedUser

interface AllowedUserRepository {
    fun findByEmployeeNumber(employeeNumber: Int): AllowedUser?
}