package com.example.pertemuan61.api

import com.example.pertemuan61.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface APiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>
}