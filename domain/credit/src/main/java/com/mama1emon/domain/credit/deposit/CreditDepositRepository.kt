package com.mama1emon.domain.credit.deposit

import com.mama1emon.domain.credit.models.Credit

/**
 * @author Andrew Khokhlov on 27/01/2023
 */
interface CreditDepositRepository {

    suspend fun getCredit(id: String): Credit

    suspend fun saveCredit(credit: Credit)
}