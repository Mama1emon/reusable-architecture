package com.mama1emon.data.token.models

/**
 * @author Andrew Khokhlov on 30/01/2023
 */
data class TokenDTO(
    val id: String,
    val name: String,
    val symbol: String,
    val networkName: String,
    val iconUrl: String
)
