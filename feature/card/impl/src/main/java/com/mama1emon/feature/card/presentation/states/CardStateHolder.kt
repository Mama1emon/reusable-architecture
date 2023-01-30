package com.mama1emon.feature.card.presentation.states

import com.mama1emon.domain.credit.models.Credit
import com.mama1emon.domain.credit.models.NewCredit

/**
 * @author Andrew Khokhlov on 30/01/2023
 */
sealed interface CardStateHolder {

    object Loading: CardStateHolder

    class Content(
        val credit: Credit,
        val newCredit: NewCredit
    ) : CardStateHolder
}