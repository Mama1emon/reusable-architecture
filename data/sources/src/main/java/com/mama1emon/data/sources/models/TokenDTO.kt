package com.mama1emon.data.sources.models

/**
 * @author Andrew Khokhlov on 31/01/2023
 */
// Retrofit annotation
data class TokenDTO(
    val id: String,
    val name: String,
    val symbol: String,
    val networkName: String,
    val iconUrl: String
)
