package com.mama1emon.feature.profile.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mama1emon.feature.profile.api.ProfileEntry
import com.mama1emon.feature.profile.presentation.ui.ProfileScreen
import com.mama1emon.feature.profile.presentation.viewmodels.ProfileViewModel
import javax.inject.Inject

class ProfileEntryImpl @Inject constructor() : ProfileEntry {

    override fun NavGraphBuilder.getComposable() {
        composable("profile") {
            val viewModel = hiltViewModel<ProfileViewModel>().also(ProfileViewModel::getCreditInfo)
            ProfileScreen(viewModel.uiState)
        }
    }
}