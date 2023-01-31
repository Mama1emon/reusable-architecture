package com.mama1emon.feature.profile.presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mama1emon.feature.profile.presentation.states.ProfileStateHolder

@Composable
fun ProfileScreen(uiState: ProfileStateHolder) {
    when (uiState) {
        is ProfileStateHolder.Content -> ProfileContent(uiState)
        ProfileStateHolder.Loading -> Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    }
}

@Composable
fun ProfileContent(content: ProfileStateHolder.Content) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = content.credit.toString())
        Text(text = content.tokens.joinToString(separator = ","))
    }
}
