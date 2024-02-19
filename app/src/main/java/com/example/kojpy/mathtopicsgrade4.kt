package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivityMathtopicsgrade4Binding

private lateinit var binding: ActivityMathtopicsgrade4Binding


class mathtopicsgrade4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMathtopicsgrade4Binding.inflate(layoutInflater)
        setContentView(binding.root)





        binding.probabilityimg.setOnClickListener {
            val intent= Intent(this, probabilitygrade4quiz::class.java)
            startActivity(intent)
        }

        binding.geometryimg.setOnClickListener {
            val intent= Intent(this, geometrygrade4quiz::class.java)
            startActivity(intent)
        }

        binding.statisticssimg.setOnClickListener {
            val intent= Intent(this, statisticsgrade4quiz ::class.java)
            startActivity(intent)
        }




    }
}