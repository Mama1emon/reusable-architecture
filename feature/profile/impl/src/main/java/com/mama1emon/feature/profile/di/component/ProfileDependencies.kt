package com.mama1emon.feature.profile.di.component

import com.mama1emon.domain.credit.deposit.CreditDepositUseCase
import com.mama1emon.feature.profile.data.ProfileRepository
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@InstallIn(ProfileComponent::class)
interface ProfileDependencies {

    val creditDepositUseCase: CreditDepositUseCase

    val profileRepository: ProfileRepository
}
