package com.mama1emon.feature.profile.di.modules

import com.mama1emon.feature.profile.api.ProfileEntry
import com.mama1emon.feature.profile.presentation.navigation.ProfileEntryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author Andrew Khokhlov on 27/01/2023
 */
@Module
@InstallIn(SingletonComponent::class)
internal interface ProfileNavigationModule {

    @Singleton
    @Binds
    fun bindProfileEntry(cardNavigationImpl: ProfileEntryImpl): ProfileEntry
}