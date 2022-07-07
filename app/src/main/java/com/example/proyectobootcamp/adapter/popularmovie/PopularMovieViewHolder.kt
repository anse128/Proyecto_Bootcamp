package com.example.proyectobootcamp.adapter.popularmovie

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.proyectobootcamp.Movie_2
import com.example.proyectobootcamp.R
import com.example.proyectobootcamp.models.movie.Movie
import com.example.proyectobootcamp.models.popularmovie.PopularMovie

class PopularMovieViewHolder(view: View):RecyclerView.ViewHolder(view){

    private val IMAGE_BASE = "https://image.tmdb.org/t/p/w500"


    val name = view.findViewById<TextView>(R.id.movie_title)
    val score = view.findViewById<TextView>(R.id.movie_score)
    val photo = view.findViewById<ImageView>(R.id.movie_poster)

    fun render(popularMovieModel: PopularMovie, onClickListener: (PopularMovie) -> Unit) {
        name.text = popularMovieModel.title
        score.text = popularMovieModel.vote

        Glide.with(photo.context).load(IMAGE_BASE + popularMovieModel.poster).into(photo)
        itemView.setOnClickListener { onClickListener(popularMovieModel) }
    }
}