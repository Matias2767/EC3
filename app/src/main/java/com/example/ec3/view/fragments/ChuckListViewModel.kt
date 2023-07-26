package com.example.ec3.view.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ec3.data.repository.ChuckRepository
import com.example.ec3.data.response.ApiResponse
import com.example.ec3.model.Chuck
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ChuckListViewModel: ViewModel() {
    val repository = ChuckRepository()
    val chuckList: MutableLiveData<List<Chuck>> = MutableLiveData<List<Chuck>>()

    fun getChuckFromService(){
        viewModelScope.launch(Dispatchers.IO){
            val response = repository.getJokes()
            when(response){
                is ApiResponse.Error -> {

                }
                is ApiResponse.Success -> {
                    chuckList.postValue(response.data.jokes)
                }
            }
        }
    }
}