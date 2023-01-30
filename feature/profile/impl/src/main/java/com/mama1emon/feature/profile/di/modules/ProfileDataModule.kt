package com.mama1emon.feature.profile.di.modules

import com.mama1emon.data.token.TokenStore
import com.mama1emon.feature.profile.data.ProfileRepository
import com.mama1emon.feature.profile.di.component.ProfileComponent
import com.mama1emon.feature.profile.presentation.converter.GetTokenListConverter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

/**
 * @author Andrew Khokhlov on 27/01/2023
 */
@Module
@InstallIn(ProfileComponent::class)
object ProfileDataModule {

    @Provides
    fun provideProfileRepository(): ProfileRepository {
        return ProfileRepository(
            tokenStore = TokenStore(
                getTokenListConverter = GetTokenListConverter::map
            )
        )
    }
}