package com.example.ec3.view

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.ec3.R
import com.example.ec3.databinding.ItemChuckBinding
import com.example.ec3.model.Chuck

class RVChuckListAdapter(var chuck: List<Chuck>): RecyclerView.Adapter<ChuckVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChuckVH {
        val binding = ItemChuckBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChuckVH(binding)
    }

    override fun getItemCount(): Int = chuck.size

    override fun onBindViewHolder(holder: ChuckVH, position: Int) {
        holder.bind(chuck.run {get(position)})
    }
}

class ChuckVH(private val binding: ItemChuckBinding): RecyclerView.ViewHolder(binding.root){


    fun bind(chuck: Chuck){
        binding.imageView.setImageResource(R.drawable.pelea)
        binding.txtChiste.text = chuck.value
        binding.txtCreate.text = chuck.createdAt
        binding.txtId.text = chuck.id
    }

}


