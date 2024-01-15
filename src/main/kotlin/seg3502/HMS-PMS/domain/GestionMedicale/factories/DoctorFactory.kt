package seg3502.`HMS-PMS`.domain.GestionMedicale.factories

import seg3502.`HMS-PMS`.domain.GestionMedicale.entities.Doctor

interface DoctorFactory {
    fun createDoctor(name: String, specialty: String): Doctor
}

