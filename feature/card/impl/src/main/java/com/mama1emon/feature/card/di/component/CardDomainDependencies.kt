package com.mama1emon.feature.card.di.component

import com.mama1emon.domain.credit.CreditDepositUseCase
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@InstallIn(CardDomainComponent::class)
interface CardDomainDependencies {

    val creditDepositUseCase: CreditDepositUseCase
}
