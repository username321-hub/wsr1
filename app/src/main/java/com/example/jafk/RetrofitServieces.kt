package com.example.jafk

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServieces {
    @GET("random")
    fun getJokesList(): Call<MutableList<jokesX>>
}