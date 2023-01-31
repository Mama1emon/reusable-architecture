package com.mama1emon.feature.card.presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.mama1emon.feature.card.presentation.states.CardStateHolder

@Composable
fun CardScreen(uiState: CardStateHolder) {
    when (uiState) {
        is CardStateHolder.Content -> CardContent(uiState)
        is CardStateHolder.Loading -> Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    }
}

@Composable
fun CardContent(content: CardStateHolder.Content) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = content.credit.toString())
        Text(text = content.newCredit.toString())
    }
}