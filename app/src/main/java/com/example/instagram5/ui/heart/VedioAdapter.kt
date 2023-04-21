package com.example.instagram5.ui.heart

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram5.R
import com.example.instagram5.ui.dashboard.ItemAdapter


    class VedioAdapter(private val itemList:List<Vedio>): RecyclerView.Adapter<com.example.instagram5.ui.heart.VedioAdapter.VedioHolder>(){

        class VedioViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            var vedioView:  =itemView.findViewById(R.id.ved)
        }




