package com.example.simexch.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simexch.data.repository.Repository
import com.example.simexch.model.nal.Nal
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel() {

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Nal>> = MutableLiveData()

        fun getNalMoney() {
            viewModelScope.launch {
                myMoneyList.value = repo.getNal()
            }
        }


}