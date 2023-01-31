package com.mama1emon.feature.card.presentation.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mama1emon.feature.card.di.component.CardDependenciesProvider
import com.mama1emon.feature.card.presentation.states.CardStateHolder
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * @author Andrew Khokhlov on 28/01/2023
 */
@HiltViewModel
class CardViewModel @Inject constructor(
    componentProvider: CardDependenciesProvider
) : ViewModel() {

    var uiState by mutableStateOf<CardStateHolder>(CardStateHolder.Loading)
        private set

    private val creditDepositUseCase = componentProvider.creditDepositUseCase
    private val creditNewUseCase = componentProvider.creditNewUseCase

    fun getCreditInfo() {
        viewModelScope.launch(Dispatchers.Main) {
            runCatching {
                withContext(Dispatchers.IO) {
                    CardStateHolder.Content(
                        credit = creditDepositUseCase.getCreditInfo("1"),
                        newCredit = creditNewUseCase.open("1")
                    )
                }
            }
                .onSuccess { uiState = it }
        }
    }
}