package com.mama1emon.feature.profile.data

import com.mama1emon.data.sources.TechApi
import com.mama1emon.data.sources.models.CreditDTO
import com.mama1emon.data.token.TokenStore
import com.mama1emon.domain.credit.deposit.CreditDepositRepository
import com.mama1emon.domain.credit.models.Credit
import com.mama1emon.feature.profile.presentation.models.Token

/**
 * @author Andrew Khokhlov on 29/01/2023
 */
class ProfileRepository(
    private val techApi: TechApi,
    private val tokenStore: TokenStore<Token>
) : CreditDepositRepository {

    override suspend fun getCredit(id: String): Credit {
        return Credit(
            id = id,
            total = 3.0,
            paid = 2.0,
            expiredDate = "profile"
        )
    }

    override suspend fun saveCredit(credit: Credit) {
        return techApi.saveCredit(
            credit = CreditDTO(
                id = credit.id,
                total = credit.total,
                paid = credit.paid,
                expiredDate = credit.expiredDate
            )
        )
    }

    suspend fun getTokenList() = tokenStore.getTokenList()
}