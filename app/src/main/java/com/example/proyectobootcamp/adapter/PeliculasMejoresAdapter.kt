package com.example.proyectobootcamp.adapter

import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectobootcamp.Item
import com.example.proyectobootcamp.R

class PeliculasMejoresAdapter(private val itemList:List<Item>, private val onClickListener:(Item) -> Unit): RecyclerView.Adapter<PeliculasMejoresViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculasMejoresViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PeliculasMejoresViewHolder(layoutInflater.inflate(R.layout.item_peliculas_mejores, parent, false))
    }

    override fun onBindViewHolder(holder: PeliculasMejoresViewHolder, position: Int) {
        val item_ = itemList[position]
        holder.render(item_, onClickListener)
    }

    override fun getItemCount(): Int = itemList.size    //nos devuelve el listado


}