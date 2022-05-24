package com.example.proyectobootcamp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectobootcamp.Item
import com.example.proyectobootcamp.R

class ItemAdapter(private val itemList:List<Item>): RecyclerView.Adapter<ItemViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ItemViewHolder(layoutInflater.inflate(R.layout.item_item, parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item_ = itemList[position]
        holder.render(item_)
    }

    override fun getItemCount(): Int = itemList.size    //nos devuelve el listado


}