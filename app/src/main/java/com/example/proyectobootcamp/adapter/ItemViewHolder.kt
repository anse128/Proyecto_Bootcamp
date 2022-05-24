package com.example.proyectobootcamp.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectobootcamp.Item
import com.example.proyectobootcamp.R

class ItemViewHolder(view: View):RecyclerView.ViewHolder(view){

    val item = view.findViewById<TextView>(R.id.tvItemName)
    val realName = view.findViewById<TextView>(R.id.tvItemName)
    val photo = view.findViewById<TextView>(R.id.tvItemName)

    fun render(itemModel:Item){
        item.text = itemModel.Item
        realName.text = itemModel.Item
        photo.text = itemModel.Item
    }

}