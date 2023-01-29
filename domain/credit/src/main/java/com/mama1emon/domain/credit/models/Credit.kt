package com.mama1emon.domain.credit.models

/**
 * @author Andrew Khokhlov on 27/01/2023
 */
data class Credit(
    val id: Int,
    val total: Double,
    val paid: Double,
    val expiredDate: String
) {

    internal fun depositAmount(amount: Double): Credit {
        val remainingAmount = calculateRemainingAmount()
        return when {
            remainingAmount == amount -> Credit(
                id = id,
                total = 0.0,
                paid = 0.0,
                expiredDate = ""
            )
            remainingAmount > amount -> Credit(
                id = id,
                total = total,
                paid = remainingAmount - amount,
                expiredDate = expiredDate
            )
            else -> throw IllegalStateException("")
        }
    }

    internal fun calculateRemainingAmount(): Double = total - paid
}
