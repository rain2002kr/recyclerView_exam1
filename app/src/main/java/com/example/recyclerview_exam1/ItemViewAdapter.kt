package com.example.recyclerview_exam1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_box.view.*

class ItemViewAdapter(val layoutId:Int,val list: List<ItemModel> ) : RecyclerView.Adapter<ItemDataViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemDataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent,false)
        return ItemDataViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ItemDataViewHolder, position: Int) {
        holder.containerView.receiveName.text = list[position].receiveName
        holder.containerView.receiveNumber.text = list[position].receiveNumber
        holder.containerView.transferName.text = list[position].transferName
        holder.containerView.transferNumber.text = list[position].transferNumber


    }
}