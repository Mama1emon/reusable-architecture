package com.mama1emon.feature.card.di.modules

import com.mama1emon.domain.credit.CreditDepositUseCase
import com.mama1emon.feature.card.data.CardRepository
import com.mama1emon.feature.card.di.component.CardDomainComponent
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

/**
 * @author Andrew Khokhlov on 27/01/2023
 */
@InstallIn(CardDomainComponent::class)
@Module
object CardDomainModule {

    @Provides
    fun provideCreditDepositUseCase(cardRepository: CardRepository): CreditDepositUseCase {
        return CreditDepositUseCase(cardRepository)
    }
}