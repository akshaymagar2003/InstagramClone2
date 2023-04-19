package com.example.instagram5.ui.heart

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.instagram5.R
import com.example.instagram5.databinding.FragmentDashboardBinding
import com.example.instagram5.databinding.FragmentHeartBinding
import com.example.instagram5.ui.dashboard.DashboardViewModel

class heartFragment : Fragment() {
    private var _binding: FragmentHeartBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = heartFragment()
    }

    private lateinit var viewModel: HeartViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val heartViewModel =
            ViewModelProvider(this).get(HeartViewModel::class.java)

        _binding = FragmentHeartBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHeart
        heartViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}