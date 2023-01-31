package com.mama1emon.data.sources.di

import com.mama1emon.data.sources.TechApi
import com.mama1emon.data.sources.models.CreditDTO
import com.mama1emon.data.sources.models.TokenDTO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlin.random.Random

/**
 * @author Andrew Khokhlov on 31/01/2023
 */
@Module
@InstallIn(SingletonComponent::class)
object SourcesModule {

    // add OkHttpClient and etc

    @Provides
    @Singleton
    fun provideTechApi(): TechApi {
        return object : TechApi {
            private val tokens = mutableListOf(
                TokenDTO(
                    id = "1",
                    name = "Tether USD",
                    symbol = "USDT",
                    networkName = "Ethereum",
                    iconUrl = ""
                ),
                TokenDTO(
                    id = "2",
                    name = "Coin USD",
                    symbol = "USDC",
                    networkName = "Ethereum",
                    iconUrl = ""
                ),
            )

            private val credits = mutableListOf(
                CreditDTO(id = "2", total = 3.0, paid = 0.0, expiredDate = "")
            )

            override fun getCreditPaidInfoById(id: String): Double = Random.nextDouble()

            override fun saveCredit(credit: CreditDTO) {
                val alreadySavedCreditIndex = credits.indexOfFirst { it.id == credit.id }
                if (alreadySavedCreditIndex == -1) {
                    credits.add(credit)
                } else {
                    credits.add(alreadySavedCreditIndex, credit)
                }
            }

            override fun getTokenList(): List<TokenDTO> = tokens

            override fun saveTokenList(addTokens: List<TokenDTO>) {
                tokens.addAll(addTokens)
            }
        }
    }
}