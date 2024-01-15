package seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.facade.implementation

import seg3502.hmspms.application.dtos.queries.AdmitPatientDto
import seg3502.hmspms.application.dtos.queries.AdmitPatientFromRequestDto
import seg3502.hmspms.application.dtos.queries.NewDivisionDto
import seg3502.hmspms.application.dtos.queries.RequestPatientAdmissionDto
import seg3502.hmspms.application.services.DomainEventEmitter
import seg3502.hmspms.domain.division.events.*
import seg3502.`HMS-PMS`.domain.AdministrationDuSysteme.facade.DivisionFacade
import seg3502.hmspms.domain.division.factories.DivisionFactory
import seg3502.hmspms.domain.division.factories.DivisionPatientFactory
import seg3502.hmspms.domain.division.factories.PatientAdmissionRequestFactory
import seg3502.hmspms.domain.division.repositories.DivisionBedRepository
import seg3502.hmspms.domain.division.repositories.DivisionPatientRepository
import seg3502.hmspms.domain.division.repositories.DivisionRepository
import seg3502.hmspms.domain.division.repositories.PatientAdmissionRequestRepository
import java.util.*

class DivisionFacadeImpl (
    private var divisionFactory: DivisionFactory,
    private var divisionRepository: DivisionRepository,
    private var divisionPatientFactory: DivisionPatientFactory,
    private var divisionPatientRepository: DivisionPatientRepository,
    private var patientAdmissionRequestFactory: PatientAdmissionRequestFactory,
    private var patientAdmissionRequestRepository: PatientAdmissionRequestRepository,
    private var divisionBedRepository: DivisionBedRepository,
    private var eventEmitter: DomainEventEmitter
): DivisionFacade {

    override fun newDivision(divisionInfo: NewDivisionDto): UUID {
        val division = divisionFactory.newDivision(divisionInfo)
        divisionRepository.save(division)
        eventEmitter.emit(NewDivisionCreated(UUID.randomUUID(), Date(), division.id))
        return division.id
    }

    override fun admitPatient(patientId: UUID, divisionId: UUID, admitPatientDto: AdmitPatientDto): UUID? {
        val division = divisionRepository.find(divisionId)

        if (division?.isComplete == true) {
            eventEmitter.emit(DivisionComplete(UUID.randomUUID(),
                Date(),
                divisionId))
            return null
        }

        val divisionPatientId = division?.admitPatient(patientId, admitPatientDto, divisionPatientFactory, divisionPatientRepository, divisionBedRepository)
        return if (division != null) {
            divisionRepository.save(division)

            val newPatientAdmittedEvent = NewPatientAdmited(UUID.randomUUID(),
                Date(),
                divisionId)
            eventEmitter.emit(newPatientAdmittedEvent)
            divisionPatientId
        } else {
            null
        }
    }

    override fun requestPatientAdmission(
        patientId: UUID,
        divisionId: UUID,
        requestPatientAdmissionInfo: RequestPatientAdmissionDto
    ): Boolean {
        val division = divisionRepository.find(divisionId)
        division?.requestPatientAdmission(patientId, requestPatientAdmissionInfo, patientAdmissionRequestFactory, patientAdmissionRequestRepository)
        return if (division != null) {
            divisionRepository.save(division)
            val newPatientAdmissionRequestEvent = NewPatientAdmissionRequest(UUID.randomUUID(),
                Date(),
                divisionId)
            eventEmitter.emit(newPatientAdmissionRequestEvent)
            true
        } else {
            false
        }
    }

    override fun admitPatientFromRequestList(
        divisionId: UUID,
        admitPatientFromRequestInfo: AdmitPatientFromRequestDto
    ): UUID? {
        val request = patientAdmissionRequestRepository.find(admitPatientFromRequestInfo.requestId)

        return if (request != null) {
            val admitPatientDto = AdmitPatientDto(request.localDoctor, admitPatientFromRequestInfo.roomNumber, admitPatientFromRequestInfo.bedNumber, admitPatientFromRequestInfo.privateInsuranceNumber)
            admitPatient(request.patientId, divisionId, admitPatientDto)
        } else {
            null
        }
    }

    override fun dischargePatient(divisionId: UUID, patientId: UUID): Boolean {
        val division = divisionRepository.find(divisionId)
        val dischargePatientResponse = division?.dischargePatient(patientId, divisionPatientFactory, divisionPatientRepository, divisionBedRepository)
        return if (dischargePatientResponse == true) {
            val patientDischargedEvent = PatientDischarged(UUID.randomUUID(),
                Date(),
                divisionId)
            eventEmitter.emit(patientDischargedEvent)
            true
        } else {
            false
        }
    }
}