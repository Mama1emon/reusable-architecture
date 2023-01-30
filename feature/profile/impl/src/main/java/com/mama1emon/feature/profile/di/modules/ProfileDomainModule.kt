package com.mama1emon.feature.profile.di.modules

import com.mama1emon.domain.credit.deposit.CreditDepositUseCase
import com.mama1emon.feature.profile.data.ProfileRepository
import com.mama1emon.feature.profile.di.component.ProfileComponent
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

/**
 * @author Andrew Khokhlov on 27/01/2023
 */
@Module
@InstallIn(ProfileComponent::class)
object ProfileDomainModule {

    @Provides
    fun provideCreditDepositUseCase(profileRepository: ProfileRepository): CreditDepositUseCase {
        return CreditDepositUseCase(creditDepositRepository = profileRepository)
    }
}