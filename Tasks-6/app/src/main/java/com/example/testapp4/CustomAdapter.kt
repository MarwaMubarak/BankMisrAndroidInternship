package com.example.testapp4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val list:List<ItemViewModel>): RecyclerView.Adapter<CustomAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemViewModel = list[position]

        holder.imageView.setImageResource(ItemViewModel.image)
        holder.textView.text = ItemViewModel.txt
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.item_image)
        val textView: TextView = itemView.findViewById(R.id.item_txt)
    }
}