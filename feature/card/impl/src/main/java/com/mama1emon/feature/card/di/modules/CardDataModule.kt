package com.mama1emon.feature.card.di.modules

import com.mama1emon.blockchainsdk.transaction.TransactionManagerFactory
import com.mama1emon.blockchainsdk.transaction.TransactionSigner
import com.mama1emon.data.sources.TechApi
import com.mama1emon.data.token.TokenStore
import com.mama1emon.domain.credit.models.Token
import com.mama1emon.feature.card.data.CardRepository
import com.mama1emon.feature.card.di.component.CardComponent
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

/**
 * @author Andrew Khokhlov on 27/01/2023
 */
@Module
@InstallIn(CardComponent::class)
object CardDataModule {

    @Provides
    fun provideCardRepository(techApi: TechApi): CardRepository {
        return CardRepository(
            techApi = techApi,
            transactionManagerFactory = TransactionManagerFactory(
                object : TransactionSigner {
                    override fun sign(byteArray: ByteArray): ByteArray {
                        TODO("Not yet implemented")
                    }

                }
            ),
            tokenStore = TokenStore(
                getTokenListConverter = { model ->
                    Token(id = model.id, name = model.name)
                }
            )
        )
    }
}