package com.henriette_00001.fibionacciusingrv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.henriette_00001.fibionacciusingrv.databinding.FibionacciListItemBinding


class FibionacciRvAdapter(var FibionacciList: List<FibionacciData>):RecyclerView.Adapter<FibionacciViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibionacciViewHolder {
        FibionacciViewHolder{
            val binding =
                FibionacciListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return@FibionacciViewHolder FibionacciViewHolder(binding)
            var itemView = LayoutInflater.from(parent.context).inflate(R.layout.fibionacci_list_item,parent,false)
            return@fibionacciViewHolder(itemView)
        }
    }

    override fun onBindViewHolder(holder: FibionacciViewHolder, position: Int) {
//        holder.tvFibionacci.text = fibionacciList.get(position)
        var currentNumber = FibionacciList.get(position)
        var binding = holder.binding
        binding.tvFibionacci.text = currentNumber.number

    }

    override fun getItemCount(): Int {
        return FibionacciList.size

    }
}
class FibionacciViewHolder(var binding: FibionacciListItemBinding): RecyclerView.ViewHolder(binding.root)
