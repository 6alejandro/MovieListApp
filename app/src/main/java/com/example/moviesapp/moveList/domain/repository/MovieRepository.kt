package com.example.moviesapp.moveList.domain.repository

import com.example.moviesapp.moveList.domain.model.MovieModel
import com.example.moviesapp.moveList.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    suspend fun getMovieList(
        forceFetchfromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<MovieModel>>>

    suspend fun getMovie(id: Int): Flow<Resource<MovieModel>>
}