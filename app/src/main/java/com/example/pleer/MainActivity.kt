package com.example.pleer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pleer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {


            supportFragmentManager.beginTransaction().add(R.id.container, FirstFragment()).commit()
        }
    }
}