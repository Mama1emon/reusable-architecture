package com.mama1emon.blockchainsdk.transaction.ethereum

import com.mama1emon.blockchainsdk.transaction.TransactionManager

object EthereumTransactionManager : TransactionManager {

    override fun send() {
        // do something
    }

    override fun getFee(): String = "ethereum"
}