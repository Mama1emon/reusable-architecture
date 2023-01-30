package com.mama1emon.feature.card.di.modules

import com.mama1emon.domain.credit.deposit.CreditDepositUseCase
import com.mama1emon.domain.credit.open.CreditNewUseCase
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
object CardDomainModule {

    @Provides
    fun provideCreditDepositUseCase(cardRepository: CardRepository): CreditDepositUseCase {
        return CreditDepositUseCase(creditDepositRepository = cardRepository)
    }

    @Provides
    fun provideCreditNewUseCase(cardRepository: CardRepository): CreditNewUseCase {
        return CreditNewUseCase(creditNewRepository = cardRepository)
    }
}