package com.example.pleer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pleer.databinding.ActivityMain2Binding
import com.example.pleer.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private var list = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        val adapter = AlbomAdapter(list)
        binding.rv2.adapter = adapter

    }

    private fun loadData() {
        list.add("Al Fatiha")
        list.add("Al Baqarah")
        list.add("Al Imran")
        list.add("An Nisa")
        list.add("Yusuf")
        list.add("Hud")
        list.add("Kahf")
        list.add("Al Anfal")
        list.add("Al Maaidah")
        list.add("Al Hijr")
        list.add("Al Isra")

    }
}