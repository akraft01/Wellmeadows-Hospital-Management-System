package seg3502.`HMS-PMS`.application

import java.util.UUID

interface UpdatePatientFile {
    fun updatePatientFile(patientId: UUID, patientFile: RegisterPatientDto): Boolean
}