package com.example.proyectobootcamp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.*
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectobootcamp.Item
import com.example.proyectobootcamp.ItemProvider
import com.example.proyectobootcamp.R
import com.example.proyectobootcamp.adapter.ItemAdapter
import com.example.proyectobootcamp.adapter.PeliculasMejoresAdapter
import com.example.proyectobootcamp.databinding.FragmentHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var _binding:FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        fun onItemSelected(item: Item) {
            //Toast.makeText(context, item.name, Toast.LENGTH_SHORT).show()
            // Create new fragment

            Navigation.findNavController(view).navigate(R.id.detailFragment)
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerItem2)
        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false )
        recyclerView.adapter = PeliculasMejoresAdapter(ItemProvider.itemList){ item ->
            onItemSelected(
                item
            )
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       /* binding.buttonHome.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.detailFragment)
        }*/
    }
}