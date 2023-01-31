package com.mama1emon.domain.credit.deposit

import com.mama1emon.domain.credit.models.Credit
import com.mama1emon.domain.credit.models.RemainingAmount

class CreditDepositUseCase(private val creditDepositRepository: CreditDepositRepository) {

    suspend fun getCreditInfo(id: String): Credit = creditDepositRepository.getCredit(id)

    suspend fun getRemainingAmount(id: String): RemainingAmount {
        val credit = creditDepositRepository.getCredit(id)
        return RemainingAmount(id = credit.id, amount = credit.calculateRemainingAmount())
    }

    suspend fun deposit(id: String, amount: Double) {
        return creditDepositRepository.saveCredit(
            credit = creditDepositRepository.getCredit(id).depositAmount(amount)
        )
    }
}