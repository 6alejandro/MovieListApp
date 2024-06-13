package com.example.moviesapp.moveList.domain.model

data class MovieModel(

    val id: Int,

    val overview: String,

    val originalLanguage: String,

    val originalTitle: String,

    val video: Boolean,

    val title: String,

    val genreIds: List<Int?>,

    val posterPath: String,

    val backdropPath: String,

    val releaseDate: String,

    val popularity: Any,

    val voteAverage: Any,

    val adult: Boolean,

    val voteCount: Int,

    val category: String
)