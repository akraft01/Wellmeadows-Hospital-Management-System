package seg3502.`HMS-PMS`.domain.GestionMedicale.factories


interface UserAccountFactory {
    fun registerStaff(userInfo: RegisterStaffDto): UserAccount
}