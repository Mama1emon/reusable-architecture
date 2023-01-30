package com.mama1emon.feature.profile.di.component

import dagger.hilt.DefineComponent
import dagger.hilt.android.components.ViewModelComponent

@DefineComponent(parent = ViewModelComponent::class)
interface ProfileComponent {

    @DefineComponent.Builder
    interface Builder {
        fun build(): ProfileComponent
    }
}
