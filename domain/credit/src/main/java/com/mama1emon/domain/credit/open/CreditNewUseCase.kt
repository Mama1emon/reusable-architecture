package com.mama1emon.domain.credit.open

import com.mama1emon.domain.credit.models.NewCredit

class CreditNewUseCase(private val creditNewRepository: CreditNewRepository) {

    suspend fun open(tokenId: String): NewCredit {
        // do something
        return creditNewRepository.open(tokenId)
    }
}