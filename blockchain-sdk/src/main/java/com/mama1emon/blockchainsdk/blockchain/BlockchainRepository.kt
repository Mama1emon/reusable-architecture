package com.mama1emon.blockchainsdk.blockchain

class BlockchainRepository {

    private val blockchains: List<Blockchain> = Blockchain.values().toList()

    fun getDerivationPath(blockchain: Blockchain): String = blockchain.fullName
}