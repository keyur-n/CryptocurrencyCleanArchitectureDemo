package com.example.cryptocurrencycleanarchitecturedemo.presentation.coin_detail

import com.example.cryptocurrencycleanarchitecturedemo.domain.model.Coin
import com.example.cryptocurrencycleanarchitecturedemo.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading:Boolean=false,
    val coins:CoinDetail? = null,
    val error:String=""
)
