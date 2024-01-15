package seg3502.HMS-PMS.domain.GestionMedicale.factories

import seg3502.HMS-PMS.domain.GestionMedicale.entities.Prescription

interface PrescriptionFactory {
    fun createPrescription(prescriptionId: Int, drugName: String, dosage: String, frequency: String): Prescription
}


