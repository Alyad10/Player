package com.example.pleer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pleer.databinding.FragmentFirstBinding
import com.example.pleer.databinding.ItemSongsBinding

class PleerAdapter(val pleerList: ArrayList<Player>,
                   val onClick :(position: Int) -> Unit

    ):
    RecyclerView.Adapter<PleerAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemSongsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = pleerList.size



    inner class ViewHolder(private val binding: ItemSongsBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            itemView.setOnClickListener {
                onClick(adapterPosition)

            }
            val item = pleerList[adapterPosition]
            binding.tvOne.text = item.num.toString()
            binding.tvSinger.text = item.singer
            binding.tvSong.text = item.song
            binding.tvTime.text = item.time

        }
    }


}
