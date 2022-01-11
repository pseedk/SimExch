package com.example.simexch.data.repository

import com.example.simexch.data.api.RetrofitInstance
import com.example.simexch.model.beznal.Beznal
import com.example.simexch.model.nal.Nal
import retrofit2.Response

class Repository {

    suspend fun getNal(): Response<Nal> {
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal(): Response<Beznal > {
        return RetrofitInstance.api.getBeznalMoneys()
    }
}