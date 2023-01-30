package com.mama1emon.feature.card.di.modules

import com.mama1emon.feature.card.api.CardEntry
import com.mama1emon.feature.card.presentation.navigation.CardEntryImpl
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
interface ProfileNavigationModule {

    @Singleton
    @Binds
    fun bindCardEntry(cardNavigationImpl: CardEntryImpl): CardEntry
}