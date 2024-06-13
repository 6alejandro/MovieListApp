package com.example.moviesapp.moveList.data.local.movie

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class MovieEntity(

    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "overview")
    val overview: String,

    @ColumnInfo(name = "origialLanguage")
    val originalLanguage: String,

    @ColumnInfo(name = "origialTitle")
    val originalTitle: String,

    @ColumnInfo(name = "video")
    val video: Boolean,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "genreIds")
    val genreIds: List<Int?>,

    @ColumnInfo(name = "posterPath")
    val posterPath: String,

    @ColumnInfo(name = "backdropPath")
    val backdropPath: String,

    @ColumnInfo(name = "releaseDate")
    val releaseDate: String,

    @ColumnInfo(name = "popularity")
    val popularity: Any,

    @ColumnInfo(name = "voteAverage")
    val voteAverage: Any,

    @ColumnInfo(name = "adult")
    val adult: Boolean,

    @ColumnInfo(name = "voteCount")
    val voteCount: Int,

    @ColumnInfo(name = "category")
    val category: String
)