package com.mama1emon.feature.card.di.component

import com.mama1emon.domain.credit.deposit.CreditDepositUseCase
import com.mama1emon.domain.credit.open.CreditNewUseCase
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@InstallIn(CardComponent::class)
interface CardDependencies {

    val creditDepositUseCase: CreditDepositUseCase

    val creditNewUseCase: CreditNewUseCase
}
