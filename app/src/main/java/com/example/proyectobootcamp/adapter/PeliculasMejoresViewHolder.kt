package com.example.proyectobootcamp.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.proyectobootcamp.Item
import com.example.proyectobootcamp.R
import com.example.proyectobootcamp.databinding.ItemItemBinding

class PeliculasMejoresViewHolder(view: View):RecyclerView.ViewHolder(view){

    // val binding = ItemItemBinding.bind(view)

    val name = view.findViewById<TextView>(R.id.tvItemName)
    val photo = view.findViewById<ImageView>(R.id.ivItem)

    fun render(itemModel: Item,  onClickListener:(Item) -> Unit){
        name.text = itemModel.name
        Glide.with(photo.context).load(itemModel.photo).into(photo)

        itemView.setOnClickListener { onClickListener(itemModel) }

        /* photo.setOnClickListener { Toast.makeText(
                photo.context,
                itemModel.name,
                Toast.LENGTH_SHORT
            ).show()
        }

        itemView.setOnClickListener { Toast.makeText(
                photo.context,
                itemModel.casting,
                Toast.LENGTH_SHORT
            ).show()
        }*/
    }
}