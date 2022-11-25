package com.example.pleer

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pleer.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var building: FragmentFirstBinding
    private var list = arrayListOf<Player>()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        building = FragmentFirstBinding.inflate(layoutInflater, container, false)
        loadData()
        val adapter = PleerAdapter(list, this::onClick)
        building.recyclerView.adapter = adapter

        return building.root



    }
    private fun onClick(position:Int) {
        var intent = Intent(requireContext(), MainActivity2::class.java)
        startActivity(intent)




    }

    private fun loadData() {
        list.add(Player(1,"Omar Hisham Al Arabi", "An-Naziat","14:48"))
        list.add(Player(2,"Tarik Muhammad", "Al-Furkan","04:38"))
        list.add(Player(3,"Mishari Alafasi", "Al-Baqarah","59:40"))
        list.add(Player(4,"Saad Al Ghamidi", "Kahf","29:16"))
        list.add(Player(5,"Rayd Muhammad Kurdi", "Al-Infitar","02:36"))
        list.add(Player(6,"Islam Sohbi", "Hud","08:09"))
        list.add(Player(8,"Umayr Shamim", "Ar-Rahman","03:05"))
        list.add(Player(9,"Samir al Bashir", "Al-Hujuraat","07:48"))
        list.add(Player(10,"Rayd Muhammad Kurdi", "Al-Qamar","05:40"))

    }


}
