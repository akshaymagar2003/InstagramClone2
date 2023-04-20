package com.example.instagram5.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram5.R

class ItemAdapter(private val itemList:List<Int>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class  ItemViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val imageView:ImageView=itemView.findViewById(R.id.imageView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
     return itemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
      holder.imageView.setImageResource(itemList[position])
    }
}