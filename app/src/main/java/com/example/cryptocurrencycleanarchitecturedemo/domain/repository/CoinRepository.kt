package com.example.cryptocurrencycleanarchitecturedemo.domain.repository

import com.example.cryptocurrencycleanarchitecturedemo.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencycleanarchitecturedemo.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins():List<CoinDto>
    suspend fun getCoinById(coinId:String):CoinDetailDto
}