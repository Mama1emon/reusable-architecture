package com.mama1emon.feature.card.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mama1emon.feature.card.api.CardEntry
import com.mama1emon.feature.card.presentation.ui.CardScreen
import com.mama1emon.feature.card.presentation.viewmodels.CardViewModel
import javax.inject.Inject

class CardEntryImpl @Inject constructor() : CardEntry {

    override fun NavGraphBuilder.getComposable() {
        composable("card") {
            val viewModel = hiltViewModel<CardViewModel>().also(CardViewModel::getCreditInfo)
            CardScreen(viewModel.uiState)
        }
    }
}