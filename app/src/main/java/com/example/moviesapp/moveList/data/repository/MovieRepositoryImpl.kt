package com.example.moviesapp.moveList.data.repository

import com.example.moviesapp.moveList.data.local.movie.MovieDatabase
import com.example.moviesapp.moveList.data.remote.ApiService
import com.example.moviesapp.moveList.domain.model.MovieModel
import com.example.moviesapp.moveList.domain.repository.MovieRepository
import com.example.moviesapp.moveList.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieApi: ApiService,
    private val movieDatabase: MovieDatabase
) {
    override suspend fun getMovieList(
        forceFetchfromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<MovieModel>>> {
        return flow {
            emit(Resource.Loading(true))

            val localMovieList = movieDatabase.movieDao.getMoviesByCategory(category)

            val shouldLoadLocalMovie = localMovieList.isEmpty() && !forceFetchfromRemote

            if (shouldLoadLocalMovie) {
                emit(
                    Resource.Success(
                        data = localMovieList
                    )
                )
            }
        }
    }

    override suspend fun getMovie(id: Int): Flow<Resource<MovieModel>> {
        TODO("Not yet implemented")
    }
}