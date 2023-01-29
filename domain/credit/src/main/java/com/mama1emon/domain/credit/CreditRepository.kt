package com.mama1emon.domain.credit

import com.mama1emon.domain.credit.models.Credit

/**
 * @author Andrew Khokhlov on 27/01/2023
 */
interface CreditRepository {

    suspend fun getCredit(id: Int): Credit

    suspend fun saveCredit(credit: Credit)
}