package com.mama1emon.feature.card.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.mama1emon.feature.card.CardScreen
import com.mama1emon.feature.card.api.CardEntry
import javax.inject.Inject

class CardEntryImpl @Inject constructor() : CardEntry {

    override fun NavGraphBuilder.getComposable() {
        composable("card") {
            CardScreen()
        }
    }
}