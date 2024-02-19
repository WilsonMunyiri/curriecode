package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivityMathtopicsgrade3Binding
import com.example.kojpy.databinding.ActivityMathtopicsgradetwo2Binding

private lateinit var binding: ActivityMathtopicsgrade3Binding




class mathtopicsgrade3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMathtopicsgrade3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.probabilityimg.setOnClickListener {
            val intent= Intent(this, probabilitygrade3quiz::class.java)
            startActivity(intent)
        }

        binding.geometryimg.setOnClickListener {
            val intent= Intent(this, geometrygrade3quiz::class.java)
            startActivity(intent)
        }

        binding.statisticssimg.setOnClickListener {
            val intent= Intent(this, statisticsgrade3quiz ::class.java)
            startActivity(intent)
        }


    }
}