package com.mama1emon.data.sources

import com.mama1emon.data.sources.models.CreditDTO
import com.mama1emon.data.sources.models.TokenDTO

/**
 * @author Andrew Khokhlov on 31/01/2023
 */
// Retrofit annotation
interface TechApi {

    // Retrofit annotation
    fun getCreditPaidInfoById(id: String): Double

    fun saveCredit(credit: CreditDTO)

    // Retrofit annotation
    fun getTokenList(): List<TokenDTO>

    // Retrofit annotation
    fun saveTokenList(addTokens: List<TokenDTO>)
}