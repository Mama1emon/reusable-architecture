package com.mama1emon.feature.profile.di.component

import dagger.hilt.EntryPoints
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

/**
 * @author Andrew Khokhlov on 29/01/2023
 */
@ViewModelScoped
class ProfileDependenciesProvider @Inject constructor(
    private val componentBuilder: ProfileComponent.Builder
) : ProfileDependencies by EntryPoints.get(
    componentBuilder.build(),
    ProfileDependencies::class.java
)