package com.example.pertemuan61.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiConfig {
    const val baseURL = "https://rickandmortyapi.com/api/"

    fun getRetrofit() : Retrofit{
        return Retrofit.Builder(). baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getservice() : APiService{
        return getRetrofit().create(APiService::class.java)
    }
}