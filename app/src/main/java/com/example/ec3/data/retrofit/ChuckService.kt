package com.example.ec3.data.retrofit

import com.example.ec3.data.response.ChuckListResponse
import retrofit2.http.GET

interface ChuckService {
    @GET("jokes/random")
    suspend fun getJokes() : ChuckListResponse
}