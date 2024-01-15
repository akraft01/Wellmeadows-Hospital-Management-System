package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.entities

import seg3502.hmspms.application.dtos.queries.AdmitPatientDto
import seg3502.hmspms.application.dtos.queries.RequestPatientAdmissionDto
import seg3502.hmspms.domain.division.factories.DivisionPatientFactory
import seg3502.hmspms.domain.division.factories.PatientAdmissionRequestFactory
import seg3502.hmspms.domain.division.repositories.DivisionBedRepository
import seg3502.hmspms.domain.division.repositories.DivisionPatientRepository
import seg3502.hmspms.domain.division.repositories.PatientAdmissionRequestRepository
import java.util.*

class Division (
    val id: UUID,
    val divisionIdentifier: String,
    val divisionName: String,
    val location: String,
    val totalBeds: Int,
    val phoneExtensionNumber: Int,
    var isComplete: Boolean = false
) {
    lateinit var chargeNurse: ChargeNurse
    var occupiedBeds: Int = 0
    val divisionPatients: MutableList<UUID> = ArrayList()
    val admissionRequests: MutableList<UUID> = ArrayList()
    val rooms: MutableList<UUID> = ArrayList()

    fun admitPatient(patientId: UUID, admitPatientDto: AdmitPatientDto, divisionPatientFactory: DivisionPatientFactory, divisionPatientRepository: DivisionPatientRepository, divisionBedRepository: DivisionBedRepository): UUID? {
        val newDivisionPatient = divisionPatientFactory.createDivisionPatient(patientId, admitPatientDto)
        divisionPatients.add(newDivisionPatient.patientId)
        divisionPatientRepository.save(newDivisionPatient)

        val bed = divisionBedRepository.findByBedNumber(admitPatientDto.bedNumber)
        if (bed != null) {
            bed.isOccupied = true
            divisionBedRepository.save(bed)
            occupiedBeds++
            if (occupiedBeds == totalBeds) {
                isComplete = true
            }
        }

        return newDivisionPatient.id
    }

    fun requestPatientAdmission(patientId: UUID, requestPatientAdmissionInfo: RequestPatientAdmissionDto, admissionRequestFactory: PatientAdmissionRequestFactory, admissionRequestRepository: PatientAdmissionRequestRepository): UUID {
        val newAdmissionRequest = admissionRequestFactory.requestPatientAdmission(patientId, requestPatientAdmissionInfo)
        admissionRequests.add(newAdmissionRequest.id)
        admissionRequestRepository.save(newAdmissionRequest)
        return newAdmissionRequest.id
    }

    fun dischargePatient(patientId: UUID, divisionPatientFactory: DivisionPatientFactory, divisionPatientRepository: DivisionPatientRepository, divisionBedRepository: DivisionBedRepository): Boolean {
        val bedNumber = divisionPatientRepository.find(patientId)?.bedNumber
        val bed = bedNumber?.let { divisionBedRepository.findByBedNumber(it) }
        if (bed != null) {
            bed.isOccupied = false
            divisionBedRepository.save(bed)
            divisionPatients.remove(patientId)
            occupiedBeds--
            isComplete = false
        }
        return true
    }
}