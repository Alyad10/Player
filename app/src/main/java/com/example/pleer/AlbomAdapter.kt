package com.example.pleer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pleer.databinding.ItemSuriBinding

class AlbomAdapter(val albomlist: ArrayList<String>):
    RecyclerView.Adapter<AlbomAdapter.ViewHolder>() {



        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(ItemSuriBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(albomlist[position])
        }

        override fun getItemCount() = albomlist.size

        inner class ViewHolder(private val binding: ItemSuriBinding) :
            RecyclerView.ViewHolder(binding.root) {
            fun bind(name : String){
                binding.tvSura.text = name
            }
        }

    }
