package com.example.proyectobootcamp.models.movie

import com.example.proyectobootcamp.models.movie.Movie
import com.google.gson.annotations.SerializedName



data class MovieProvider(
    @SerializedName("items") val movies: List<Movie> = mutableListOf()
)
