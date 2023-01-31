package com.mama1emon.data.sources.models

/**
 * @author Andrew Khokhlov on 27/01/2023
 */
data class CreditDTO(
    val id: String,
    val total: Double,
    val paid: Double,
    val expiredDate: String
)