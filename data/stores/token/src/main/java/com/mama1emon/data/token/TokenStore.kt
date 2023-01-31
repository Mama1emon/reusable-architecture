package com.mama1emon.data.token

import com.mama1emon.data.token.models.TokenDTO

class TokenStore<To>(private val getTokenListConverter: (TokenDTO) -> To) {

    suspend fun getTokenList(): List<To> = getTokenListByApi().map(getTokenListConverter)

    suspend fun saveTokenList(tokens: List<TokenDTO>) {
        TODO("Not yet implemented")
    }

    private fun getTokenListByApi(): List<TokenDTO> {
        return listOf(
            TokenDTO(
                id = "1",
                name = "Tether USD",
                symbol = "USDT",
                networkName = "Ethereum",
                iconUrl = ""
            ),
            TokenDTO(
                id = "2",
                name = "Coin USD",
                symbol = "USDC",
                networkName = "Ethereum",
                iconUrl = ""
            ),
        )
    }
}