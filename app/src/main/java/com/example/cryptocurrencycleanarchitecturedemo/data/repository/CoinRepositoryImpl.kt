package com.example.cryptocurrencycleanarchitecturedemo.data.repository

import com.example.cryptocurrencycleanarchitecturedemo.data.remote.CoinPaprikaApi
import com.example.cryptocurrencycleanarchitecturedemo.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencycleanarchitecturedemo.data.remote.dto.CoinDto
import com.example.cryptocurrencycleanarchitecturedemo.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val api: CoinPaprikaApi):CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoinsApi()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinApi(coinId)
    }
}