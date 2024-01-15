package seg3502.`HMS-PMS`.domain.GestionMedicale.repositories


import java.util.UUID

interface UserAccountRepository {
    fun find(userId: UUID): UserAccount?
    fun findByEmployeeNumber(employeeNumber: Int): UserAccount?
    fun save(userAccount: UserAccount): UserAccount
}