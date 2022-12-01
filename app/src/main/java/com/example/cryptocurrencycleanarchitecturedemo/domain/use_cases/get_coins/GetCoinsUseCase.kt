package com.example.cryptocurrencycleanarchitecturedemo.domain.use_cases.get_coins

import com.example.cryptocurrencycleanarchitecturedemo.common.Resource
import com.example.cryptocurrencycleanarchitecturedemo.data.repository.dto.toCoin
import com.example.cryptocurrencycleanarchitecturedemo.domain.model.Coin
import com.example.cryptocurrencycleanarchitecturedemo.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke():Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins= repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        }catch (e:HttpException){
            emit(Resource.Error(e.localizedMessage?:"An unexpected error"))
        } catch (eio:IOException){
            emit(Resource.Error("Couldn't reach the server"))
        }
    }
}