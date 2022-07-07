package com.example.proyectobootcamp.models.popularmovie

import com.example.proyectobootcamp.models.movie.Movie
import com.google.gson.annotations.SerializedName

data class PopularMovieProvider(@SerializedName("results") val popularMovies: List<PopularMovie> = mutableListOf())