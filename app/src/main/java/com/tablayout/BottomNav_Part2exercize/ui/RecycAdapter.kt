package com.tablayout.BottomNav_Part2exercize.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tablayout.BottomNav_Part2exercize.data.DataModel
import com.tablayout.R
import kotlinx.android.synthetic.main.item_linear.view.*
import java.util.zip.Inflater

class RecycAdapter : RecyclerView.Adapter<RecycAdapter.Vholder>() {
    private var list = arrayListOf<DataModel>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_linear, parent, false)
        return Vholder(view)
    }

    override fun getItemCount() = list.size

    fun update(list: List<DataModel>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: Vholder, position: Int) {
        holder.bind(list[position])
    }

    class Vholder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(data: DataModel) {
            itemView.TVone.text = data.title
        }
    }
}