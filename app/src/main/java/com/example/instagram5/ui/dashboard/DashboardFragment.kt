package com.example.instagram5.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.instagram5.R
import com.example.instagram5.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private lateinit var itemList: ArrayList<Int>
    private lateinit var itemAdapter: ItemAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
     lateinit var  recyclerView:RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
        init()
    }

    private fun init() {
        itemList= ArrayList()
        recyclerView= binding.recyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
addToList()
        itemAdapter=ItemAdapter(itemList)
        recyclerView.adapter=itemAdapter

    }
    private fun addToList(){
        itemList.add(R.drawable.flower1)
        itemList.add(R.drawable.flower2)
        itemList.add(R.drawable.flower3)
        itemList.add(R.drawable.flower4)
        itemList.add(R.drawable.flower1)
        itemList.add(R.drawable.flower2)
        itemList.add(R.drawable.flower3)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}