package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivityGradetwoBinding

private lateinit var binding: ActivityGradetwoBinding


class gradetwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGradetwoBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.mathematics.setOnClickListener {
            val intent = Intent(this, mathtopicsgradetwo::class.java)
            startActivity(intent)
        }



        binding.science.setOnClickListener {
            val intent= Intent(this, sciencetopicsgrade1::class.java)
            startActivity(intent)


        }






    }
}