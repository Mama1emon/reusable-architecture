package com.mama1emon.core.navigation

import androidx.navigation.NavGraphBuilder

/**
 * @author Andrew Khokhlov on 28/01/2023
 */
interface FeatureEntry {

    fun NavGraphBuilder.getComposable()
}