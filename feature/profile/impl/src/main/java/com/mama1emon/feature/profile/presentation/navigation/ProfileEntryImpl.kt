package com.mama1emon.feature.profile.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mama1emon.feature.profile.ProfileScreen
import com.mama1emon.feature.profile.api.ProfileEntry
import javax.inject.Inject

class ProfileEntryImpl @Inject constructor() : ProfileEntry {

    override fun NavGraphBuilder.getComposable() {
        composable("profile") {
            ProfileScreen()
        }
    }
}