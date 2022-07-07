package com.example.proyectobootcamp.models.popularmovie

import com.google.gson.annotations.SerializedName

data class PopularMovie(
    @SerializedName("id")
    val id: String = "",

    @SerializedName("title")
    val title: String = "",

    @SerializedName("poster_path")
    val poster: String = "",

    @SerializedName("release_date")
    val release: String = "",

    @SerializedName("vote_average")
    val vote: String = ""

)
