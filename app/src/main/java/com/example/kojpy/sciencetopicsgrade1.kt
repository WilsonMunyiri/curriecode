package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.kojpy.databinding.ActivitySciencetopicsgrade1Binding

private lateinit var binding: ActivitySciencetopicsgrade1Binding

class sciencetopicsgrade1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySciencetopicsgrade1Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.biologyimg.setOnClickListener {
            val intent=Intent(this,biologyquiz::class.java )
            startActivity(intent)
        }


        binding.chemistryimg.setOnClickListener {
            val intent=Intent(this,chemistryquiz::class.java )
            startActivity(intent)
        }


        binding.physicsimg.setOnClickListener {
            val intent=Intent(this,physicsquiz::class.java )
            startActivity(intent)
        }




    }
}