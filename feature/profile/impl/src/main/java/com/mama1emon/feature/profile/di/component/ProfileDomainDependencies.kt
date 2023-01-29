package com.mama1emon.feature.profile.di.component

import com.mama1emon.domain.credit.CreditDepositUseCase
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@InstallIn(ProfileDomainComponent::class)
interface ProfileDomainDependencies {

    val creditDepositUseCase: CreditDepositUseCase
}
