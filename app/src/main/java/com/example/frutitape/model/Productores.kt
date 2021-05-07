package com.example.frutitape.model

import com.google.gson.annotations.SerializedName

data class Productores (
    @SerializedName("name") val nombre:String,
    val imageUrl:Int
    )

/*
data class Productores (
@SerializedName("id") val id : Int,
@SerializedName("name") val nombre : String,
@SerializedName("surname") val surname : String,
@SerializedName("documentNumber") val documentNumber : Int,
@SerializedName("documentType") val documentType : Int,
@SerializedName("status") val status : Int,
val imageUrl:Int
)*/