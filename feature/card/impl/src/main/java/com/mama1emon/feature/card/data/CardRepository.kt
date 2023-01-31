package com.mama1emon.feature.card.data

import com.mama1emon.data.sources.TechApi
import com.mama1emon.data.sources.models.CreditDTO
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
    private val techApi: TechApi,
    private val tokenStore: TokenStore<Token>
) : CreditDepositRepository, CreditNewRepository {

    override suspend fun getCredit(id: String): Credit {
        return Credit(
            id = id,
            total = 3.0,
            paid = techApi.getCreditPaidInfoById(id),
            expiredDate = "card"
        )
    }

    override suspend fun saveCredit(credit: Credit) {
        techApi.saveCredit(
            credit = CreditDTO(
                id = credit.id,
                total = credit.total,
                paid = credit.paid,
                expiredDate = credit.expiredDate
            )
        )
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