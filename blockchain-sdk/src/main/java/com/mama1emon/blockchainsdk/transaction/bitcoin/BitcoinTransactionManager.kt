package com.mama1emon.blockchainsdk.transaction.bitcoin

import com.mama1emon.blockchainsdk.transaction.TransactionManager

object BitcoinTransactionManager : TransactionManager {

    override fun send() {
        // do something
    }

    override fun getFee(): String = "bitcoin"
}