package com.example.proyectobootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectobootcamp.adapter.ItemAdapter
import com.example.proyectobootcamp.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }
    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        //val decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerItem.layoutManager = manager
        binding.recyclerItem.adapter =
            ItemAdapter(ItemProvider.itemList) { item ->
                onItemSelected(
                    item
                )
            }
        //binding.recyclerItem.addItemDecoration(decoration)
        /*
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerItem)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(ItemProvider.itemList) */
    }
    fun onItemSelected(item: Item){
        Toast.makeText(this, item.name, Toast.LENGTH_SHORT).show()
    }
}