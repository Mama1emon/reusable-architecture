package com.mama1emon.feature.card.data

import com.mama1emon.data.token.TokenStore
import com.mama1emon.domain.credit.deposit.CreditDepositRepository
import com.mama1emon.domain.credit.models.Credit
import com.mama1emon.domain.credit.models.NewCredit
import com.mama1emon.domain.credit.models.Token
import com.mama1emon.domain.credit.open.CreditNewRepository

/**
 * @author Andrew Khokhlov on 29/01/2023
 */
class CardRepository(
    private val tokenStore: TokenStore<Token>
) : CreditDepositRepository, CreditNewRepository {

    override suspend fun getCredit(id: Int): Credit {
        return Credit(
            id = id,
            total = 3.0,
            paid = 2.0,
            expiredDate = "card"
        )
    }

    override suspend fun saveCredit(credit: Credit) {
        TODO("Not yet implemented")
    }

    override suspend fun open(tokenId: String): NewCredit {
        val token = tokenStore.getTokenList().firstOrNull { it.id == tokenId }
        return NewCredit(
            id = "1",
            token = requireNotNull(token),
            amount = "100"
        )
    }
}