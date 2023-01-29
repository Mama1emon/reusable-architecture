package com.mama1emon.feature.card

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.mama1emon.domain.credit.models.Credit
import com.mama1emon.feature.card.presentation.viewmodels.CardViewModel

@Composable
fun CardScreen() {
    val viewModel = hiltViewModel<CardViewModel>().also(CardViewModel::getCreditInfo)
    viewModel.uiState?.let { CardContent(credit = it) }
}

@Composable
fun CardContent(credit: Credit) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Text(text = credit.expiredDate)
    }
}