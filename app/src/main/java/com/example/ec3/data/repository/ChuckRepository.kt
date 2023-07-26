package com.example.ec3.data.repository

import com.example.ec3.data.response.ApiResponse
import com.example.ec3.data.response.ChuckListResponse
import com.example.ec3.data.retrofit.ServiceInstace

class ChuckRepository {
    suspend fun getJokes(): ApiResponse<ChuckListResponse> {
        return try {
            val response = ServiceInstace.getCouponService().getJokes()
            ApiResponse.Success(response)
        }catch (e:Exception){
            ApiResponse.Error(e)
        }

    }
}