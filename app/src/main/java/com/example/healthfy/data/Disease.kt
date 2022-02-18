package com.example.healthfy.data

data class Disease (
    val id: Int,
    val title: String,
    val ingredients: String,
    val instructions: String,
    val diseaseImage : Int = 0
)