package seg3502.`HMS-PMS`.domain.GestionMedicale.facade.implementation

import seg3502.hmspms.application.dtos.queries.RegisterStaffDto
import seg3502.hmspms.application.services.DomainEventEmitter
import seg3502.hmspms.domain.user.events.StaffAccountCreated
import seg3502.`HMS-PMS`.domain.GestionMedicale.facade.UserFacade
import seg3502.`HMS-PMS`.domain.GestionMedicale.factories.UserAccountFactory
import seg3502.hmspms.domain.user.repositories.UserAccountRepository
import java.util.*

class UserFacadeImpl(
    private val userAccountRepository: UserAccountRepository,
    private val userAccountFactory: UserAccountFactory,
    private var eventEmitter: DomainEventEmitter,
    ): UserFacade {

    override fun registerStaff(accountInfo: RegisterStaffDto): UUID? {
        val userId = accountInfo.employeeNumber
        if (userAccountRepository.findByEmployeeNumber(userId) != null) {
            return null
        }

        val userAccount = userAccountFactory.registerStaff(accountInfo)
        userAccountRepository.save(userAccount)
        eventEmitter.emit(
            StaffAccountCreated(
                UUID.randomUUID(),
                Date(),
                userAccount.id)
        )
        return userAccount.id
    }
}