package com.example.frutitape.model

import com.google.gson.annotations.SerializedName

data class Productores (
    @SerializedName("name") val nombre:String,
    val imageUrl:Int
    )