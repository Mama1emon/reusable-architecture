package com.mama1emon.feature.profile

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.mama1emon.domain.credit.models.Credit
import com.mama1emon.feature.profile.presentation.viewmodels.ProfileViewModel

@Composable
fun ProfileScreen() {
    val viewModel = hiltViewModel<ProfileViewModel>().also(ProfileViewModel::getCreditInfo)
    viewModel.uiState?.let { ProfileContent(credit = it) }
}

@Composable
fun ProfileContent(credit: Credit) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Text(text = credit.expiredDate)
    }
}
