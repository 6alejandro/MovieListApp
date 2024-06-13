package com.example.moviesapp.moveList.data.remote

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/{category")
    suspend fun getMovieList(
        @Path("category") category: String,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = API_KEY
    )

    companion object {
        const val API_KEY = "044110df54af63095a5227d1b131fece"
    }
}