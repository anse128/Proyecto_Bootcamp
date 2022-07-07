package com.cronocode.moviecatalog.services

import com.example.proyectobootcamp.models.movie.MovieProvider
import com.example.proyectobootcamp.models.popularmovie.PopularMovieProvider
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("list/1?api_key=c5c47722a4adcc77f6e84f28a48b857a")
    fun getMovieList(): Call<MovieProvider>

    @GET("movie/top_rated?api_key=c5c47722a4adcc77f6e84f28a48b857a&language=en-US")
    fun getMoviePopularList(): Call<PopularMovieProvider>
}