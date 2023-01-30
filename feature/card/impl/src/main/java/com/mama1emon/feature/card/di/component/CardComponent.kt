package com.mama1emon.feature.card.di.component

import dagger.hilt.DefineComponent
import dagger.hilt.android.components.ViewModelComponent

@DefineComponent(parent = ViewModelComponent::class)
interface CardComponent {

    @DefineComponent.Builder
    interface Builder {
        fun build(): CardComponent
    }
}
