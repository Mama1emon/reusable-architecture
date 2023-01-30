package com.mama1emon.feature.card.di.component

import dagger.hilt.EntryPoints
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

/**
 * @author Andrew Khokhlov on 29/01/2023
 */
@ViewModelScoped
class CardDependenciesProvider @Inject constructor(
    private val componentBuilder: CardComponent.Builder
) : CardDependencies by EntryPoints.get(
    componentBuilder.build(),
    CardDependencies::class.java
)