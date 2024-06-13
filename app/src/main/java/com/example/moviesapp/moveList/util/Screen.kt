package com.example.moviesapp.moveList.util

sealed class Screen(val root: String) {
    object Home: Screen("main")
    object PopularMovieList: Screen("popularMovie")
    object UpcomingMovieList: Screen("upcomingMovie")
    object Details: Screen("details")
}