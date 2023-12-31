package com.example.ec3.data.response

sealed class ApiResponse<T>(data: T? = null, exception: Exception? = null){
    data class Success<T>(val data: T): ApiResponse<T>(data)
    data class Error<T>(val exception: Exception): ApiResponse<T>(null, exception)
}
