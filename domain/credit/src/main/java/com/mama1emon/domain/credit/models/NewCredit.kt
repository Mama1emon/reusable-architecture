package com.mama1emon.domain.credit.models

/**
 * @author Andrew Khokhlov on 30/01/2023
 */
data class NewCredit(
    val id: String,
    val token: Token,
    val amount: String,
    val fee: String
)
