package com.example.ec3.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceInstace {
    //https://api.chucknorris.io/jokes/random
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.chucknorris.io/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getCouponService():ChuckService = retrofit.create(ChuckService::class.java)
}