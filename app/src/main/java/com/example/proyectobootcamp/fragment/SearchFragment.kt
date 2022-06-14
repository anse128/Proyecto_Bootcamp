package com.example.proyectobootcamp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectobootcamp.Item
import com.example.proyectobootcamp.ItemProvider
import com.example.proyectobootcamp.R
import com.example.proyectobootcamp.adapter.ItemAdapter



class SearchFragment : Fragment() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view: View = inflater.inflate(R.layout.fragment_search, container, false)

        fun onItemSelected(item: Item) {
            //Toast.makeText(context, item.name, Toast.LENGTH_SHORT).show()
            // Create new fragment

            Navigation.findNavController(view).navigate(R.id.detailFragment)
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerItem)
        recyclerView.layoutManager = LinearLayoutManager(context )
        recyclerView.adapter = ItemAdapter(ItemProvider.itemList){ item ->
            onItemSelected(
                item
            )
        }
        return view
        //return inflater.inflate(R.layout.fragment_search, container, false)


    }

    //**************

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}



