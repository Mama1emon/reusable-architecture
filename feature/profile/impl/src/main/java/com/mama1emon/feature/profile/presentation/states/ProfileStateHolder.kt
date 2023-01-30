package com.mama1emon.feature.profile.presentation.states

import com.mama1emon.domain.credit.models.Credit
import com.mama1emon.feature.profile.presentation.models.Token

/**
 * @author Andrew Khokhlov on 30/01/2023
 */
sealed interface ProfileStateHolder {

    object Loading: ProfileStateHolder

    class Content(
        val credit: Credit,
        val tokens: List<Token>
    ) : ProfileStateHolder
}