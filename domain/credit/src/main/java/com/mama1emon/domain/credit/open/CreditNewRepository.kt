package com.mama1emon.domain.credit.open

import com.mama1emon.domain.credit.models.NewCredit

/**
 * @author Andrew Khokhlov on 27/01/2023
 */
interface CreditNewRepository {

    suspend fun open(tokenId: String): NewCredit

    suspend fun getFee(networkId: String): String
}