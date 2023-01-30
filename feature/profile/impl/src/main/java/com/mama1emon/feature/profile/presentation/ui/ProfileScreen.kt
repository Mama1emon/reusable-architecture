package com.mama1emon.feature.profile.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.mama1emon.feature.profile.presentation.states.ProfileStateHolder
import com.mama1emon.feature.profile.presentation.viewmodels.ProfileViewModel

@Composable
fun ProfileScreen() {
    val viewModel = hiltViewModel<ProfileViewModel>().also(ProfileViewModel::getCreditInfo)
    viewModel.uiState.let {
        when (it) {
            is ProfileStateHolder.Content -> ProfileContent(it)
            ProfileStateHolder.Loading -> CircularProgressIndicator()
        }
    }
}

@Composable
fun ProfileContent(content: ProfileStateHolder.Content) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = content.credit.expiredDate)
        Text(text = content.tokens.joinToString(separator = ","))
    }
}
