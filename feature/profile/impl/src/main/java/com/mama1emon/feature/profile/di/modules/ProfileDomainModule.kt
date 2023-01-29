package com.mama1emon.feature.profile.di.modules

import com.mama1emon.domain.credit.CreditDepositUseCase
import com.mama1emon.feature.profile.data.ProfileRepository
import com.mama1emon.feature.profile.di.component.ProfileDomainComponent
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

/**
 * @author Andrew Khokhlov on 27/01/2023
 */
@InstallIn(ProfileDomainComponent::class)
@Module
object ProfileDomainModule {

    @Provides
    fun provideCreditDepositUseCase(profileRepository: ProfileRepository): CreditDepositUseCase {
        return CreditDepositUseCase(creditRepository = profileRepository)
    }
}