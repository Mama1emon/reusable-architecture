package com.mama1emon.feature.profile.presentation.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mama1emon.feature.profile.di.component.ProfileDependenciesProvider
import com.mama1emon.feature.profile.presentation.states.ProfileStateHolder
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
    private val profileDependenciesProvider: ProfileDependenciesProvider,
) : ViewModel() {

    var uiState by mutableStateOf<ProfileStateHolder>(ProfileStateHolder.Loading)
        private set

    fun getCreditInfo() {
        viewModelScope.launch(Dispatchers.Main) {
            runCatching {
                withContext(Dispatchers.IO) {
                    ProfileStateHolder.Content(
                        credit = profileDependenciesProvider.creditDepositUseCase.getCreditInfo(1),
                        tokens = profileDependenciesProvider.profileRepository.getTokenList()
                    )
                }
            }
                .onSuccess { uiState = it }
        }
    }
}