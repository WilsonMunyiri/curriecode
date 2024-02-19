package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivityGradethreeBinding
import com.example.kojpy.databinding.ActivityMathtopicsgrade3Binding

private lateinit var binding: ActivityGradethreeBinding
class gradethree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGradethreeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mathematics.setOnClickListener {

            val intent = Intent(this,mathtopicsgrade3::class.java)
            startActivity(intent)



        }


        binding.science.setOnClickListener {

            val intent = Intent(this, sciencetopicsgrade3::class.java)
            startActivity(intent)
        }



    }


    }
