package com.mama1emon.domain.credit

import com.mama1emon.domain.credit.models.Credit
import com.mama1emon.domain.credit.models.RemainingAmount

class CreditDepositUseCase(private val creditRepository: CreditRepository) {

    suspend fun getCreditInfo(id: Int): Credit = creditRepository.getCredit(id)

    suspend fun getRemainingAmount(id: Int): RemainingAmount {
        val credit = creditRepository.getCredit(id)
        return RemainingAmount(id = credit.id, amount = credit.calculateRemainingAmount())
    }

    suspend fun deposit(id: Int, amount: Double) {
        return creditRepository.saveCredit(
            credit = creditRepository.getCredit(id).depositAmount(amount)
        )
    }
}