package com.example.frutitape


import com.example.frutitape.model.Productores
import retrofit2.Call
import retrofit2.http.GET

interface APIService {

    @GET("producers")
    fun getProducer(): Call<List<Productores>>
}