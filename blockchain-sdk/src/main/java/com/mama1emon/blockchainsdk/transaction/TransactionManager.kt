package com.mama1emon.blockchainsdk.transaction

/**
 * @author Andrew Khokhlov on 31/01/2023
 */
interface TransactionManager {

    fun send()

    fun getFee(): String
}