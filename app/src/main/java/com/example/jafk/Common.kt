package com.example.jafk

import retrofit2.create

object Common {
    val BASE_URl = "http://api.icndb.com/jokes/"
    val retrofitService:RetrofitServieces
        get() = RetrofitClient.getClient(BASE_URl).create(RetrofitServieces::class.java)
}