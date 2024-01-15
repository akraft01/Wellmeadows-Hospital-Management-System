package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.repositories
import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities.HospitalManagementSystem


interface HospitalManagementSystemRepository {
    fun findById(systemId: Int): HospitalManagementSystem?
    // Other CRUD operations
}

