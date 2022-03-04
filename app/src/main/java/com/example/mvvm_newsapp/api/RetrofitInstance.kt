package com.example.mvvm_newsapp.api

import com.example.mvvm_newsapp.util.Constants.Companion.BASE_URL

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: NewsApi by lazy {
        retrofit.create(NewsApi::class.java)
    }
}