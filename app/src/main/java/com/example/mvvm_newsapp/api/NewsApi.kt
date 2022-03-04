package com.example.mvvm_newsapp.api

import com.example.mvvm_newsapp.models.NewsResponse
import com.example.mvvm_newsapp.util.Constants.Companion.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("/v2/everything")
    suspend fun search(
        @Query("q")
        query: String,
        @Query("page")
        pageNo: Int,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): NewsResponse

    @GET("/v2/top-headlines")
    suspend fun getTopNews(
        @Query("country")
        country: String = "us",
        @Query("page")
        pageNo: Int,
        @Query("apiKey")
        apiKey: String = API_KEY
    ): NewsResponse

}