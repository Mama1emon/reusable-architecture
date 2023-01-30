package com.mama1emon.feature.profile.presentation.converter

import com.mama1emon.data.token.models.TokenDTO
import com.mama1emon.feature.profile.presentation.models.Token

/**
 * @author Andrew Khokhlov on 30/01/2023
 */
object GetTokenListConverter {

    fun map(model: TokenDTO) = Token(model.id, model.name)
}