package com.example.proyectobootcamp.models.movie

import android.os.Parcelable
import com.google.gson.annotations.SerializedName


data class Movie(
    @SerializedName("id")
    val id: String = "",

    @SerializedName("title")
    val title: String = "",

    @SerializedName("poster_path")
    val poster: String = "",

    @SerializedName("release_date")
    val release: String = ""
)