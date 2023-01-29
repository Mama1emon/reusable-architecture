package com.mama1emon.feature.profile.di.component

import dagger.hilt.EntryPoints
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

/**
 * @author Andrew Khokhlov on 29/01/2023
 */
@ViewModelScoped
class ProfileDomainComponentProvider @Inject constructor(
    private val componentBuilder: ProfileDomainComponent.Builder
) : ProfileDomainDependencies by EntryPoints.get(
    componentBuilder.build(),
    ProfileDomainDependencies::class.java
)