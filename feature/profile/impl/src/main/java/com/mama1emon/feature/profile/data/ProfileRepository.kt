package com.mama1emon.feature.profile.data

import com.mama1emon.data.token.TokenStore
import com.mama1emon.domain.credit.deposit.CreditDepositRepository
import com.mama1emon.domain.credit.models.Credit
import com.mama1emon.feature.profile.presentation.models.Token

/**
 * @author Andrew Khokhlov on 29/01/2023
 */
class ProfileRepository(
    private val tokenStore: TokenStore<Token>
) : CreditDepositRepository {

    override suspend fun getCredit(id: Int): Credit {
        return Credit(
            id = id,
            total = 3.0,
            paid = 2.0,
            expiredDate = "profile"
        )
    }

    override suspend fun saveCredit(credit: Credit) {
        TODO("Not yet implemented")
    }

    suspend fun getTokenList() = tokenStore.getTokenList()
}