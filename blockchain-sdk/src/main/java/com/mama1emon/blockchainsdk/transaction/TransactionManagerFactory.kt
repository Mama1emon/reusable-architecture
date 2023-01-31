package com.mama1emon.blockchainsdk.transaction

import com.mama1emon.blockchainsdk.blockchain.Blockchain

/**
 * @author Andrew Khokhlov on 31/01/2023
 */
class TransactionManagerFactory(private val signer: TransactionSigner) {

    fun send(blockchain: Blockchain) {
        // do something
        signer.sign(ByteArray(1))
        // do something
        blockchain.transactionManager.send()
    }

    fun getFee(blockchain: Blockchain): String {
        return blockchain.transactionManager.getFee()
    }
}