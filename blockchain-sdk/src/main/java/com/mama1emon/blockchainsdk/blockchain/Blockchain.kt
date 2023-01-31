package com.mama1emon.blockchainsdk.blockchain

import com.mama1emon.blockchainsdk.transaction.TransactionManager
import com.mama1emon.blockchainsdk.transaction.bitcoin.BitcoinTransactionManager
import com.mama1emon.blockchainsdk.transaction.ethereum.EthereumTransactionManager

enum class Blockchain(
    internal val id: String,
    internal val currency: String,
    internal val fullName: String,
    internal val transactionManager: TransactionManager
    // add another params
) {
    Bitcoin(
        id = "BTC",
        currency = "BTC",
        fullName = "Bitcoin",
        transactionManager = BitcoinTransactionManager
    ),
    Ethereum(
        id = "ETH",
        currency = "ETH",
        fullName = "Ethereum",
        transactionManager = EthereumTransactionManager
    )
}