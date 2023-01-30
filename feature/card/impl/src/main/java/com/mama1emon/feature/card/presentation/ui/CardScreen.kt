package com.mama1emon.feature.card.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.mama1emon.feature.card.presentation.states.CardStateHolder
import com.mama1emon.feature.card.presentation.viewmodels.CardViewModel

@Composable
fun CardScreen() {
    val viewModel = hiltViewModel<CardViewModel>().also(CardViewModel::getCreditInfo)
    viewModel.uiState.let {
        when(it) {
            is CardStateHolder.Content -> CardContent(it)
            is CardStateHolder.Loading -> CircularProgressIndicator()
        }

    }
}

@Composable
fun CardContent(content: CardStateHolder.Content) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = content.credit.expiredDate)
        Text(text = content.newCredit.token.name)
    }
}