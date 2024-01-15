package seg3502.`HMS-PMS`.domain.GestionMedicale.facade


import java.util.*

interface UserFacade {
    fun registerStaff(accountInfo: RegisterStaffDto): UUID?
}