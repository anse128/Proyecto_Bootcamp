package com.example.proyectobootcamp.adapter.popularmovie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectobootcamp.R
import com.example.proyectobootcamp.models.popularmovie.PopularMovie

class PopularMovieAdapter(
    private val moviePopularList: List<PopularMovie>,
    private val onClickListener: (PopularMovie) -> Unit
) : RecyclerView.Adapter<PopularMovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularMovieViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PopularMovieViewHolder(
            layoutInflater.inflate(R.layout.item_popular_movie,parent,false)
        )
    }

    override fun onBindViewHolder(holder: PopularMovieViewHolder, position: Int) {
        val item = moviePopularList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = moviePopularList.size    //nos devuelve el listado


}