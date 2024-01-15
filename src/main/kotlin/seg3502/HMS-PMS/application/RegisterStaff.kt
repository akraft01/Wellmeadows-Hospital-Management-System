package seg3502.`HMS-PMS`.application


import java.util.*

interface RegisterStaff {
    fun registerStaff(staffInfo: RegisterStaffDto): UUID?
}