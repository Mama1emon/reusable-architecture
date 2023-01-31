package com.mama1emon.domain.credit.open

import com.mama1emon.domain.credit.models.NewCredit

class CreditNewUseCase(private val creditNewRepository: CreditNewRepository) {

    suspend fun open(tokenId: String): NewCredit {
        return creditNewRepository.open(tokenId).copy(
            fee = creditNewRepository.getFee("ETH")
        )
    }
}