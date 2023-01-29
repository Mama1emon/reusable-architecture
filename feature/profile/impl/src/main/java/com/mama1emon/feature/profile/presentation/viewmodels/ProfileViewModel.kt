package com.mama1emon.feature.profile.presentation.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mama1emon.domain.credit.models.Credit
import com.mama1emon.feature.profile.di.component.ProfileDomainComponentProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * @author Andrew Khokhlov on 28/01/2023
 */
@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val componentProvider: ProfileDomainComponentProvider
) : ViewModel() {

    var uiState by mutableStateOf<Credit?>(null)
        private set

    fun getCreditInfo() {
        viewModelScope.launch(Dispatchers.Main) {
            runCatching {
                withContext(Dispatchers.IO) {
                    componentProvider.creditDepositUseCase.getCreditInfo(1)
                }
            }
                .onSuccess { uiState = it }
        }
    }
}