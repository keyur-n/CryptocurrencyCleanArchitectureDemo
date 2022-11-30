package com.example.cryptocurrencycleanarchitecturedemo.data.remote

import com.example.cryptocurrencycleanarchitecturedemo.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencycleanarchitecturedemo.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoinsApi(): List<CoinDto>
    @GET("/v1/coins/{coinId}")
    suspend fun getCoinApi(@Path("coinId") coinId:String):CoinDetailDto
}