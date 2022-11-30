package com.example.cryptocurrencycleanarchitecturedemo.presentation

sealed class Screen(val route:String){
    object ScreenListScreen:Screen("coin_list_screen")
    object ScreenDetailScreen:Screen("coin_detail_screen")
}