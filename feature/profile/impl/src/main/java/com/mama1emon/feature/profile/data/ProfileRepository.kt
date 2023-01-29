package com.mama1emon.feature.profile.data

import com.mama1emon.domain.credit.CreditRepository
import com.mama1emon.domain.credit.models.Credit
import javax.inject.Inject

/**
 * @author Andrew Khokhlov on 29/01/2023
 */
class ProfileRepository @Inject constructor() : CreditRepository {

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
}