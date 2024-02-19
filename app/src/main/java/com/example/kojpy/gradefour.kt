package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivityGradefourBinding

private lateinit var binding: ActivityGradefourBinding


class gradefour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityGradefourBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mathematics.setOnClickListener {

            val intent = Intent(this,mathtopicsgrade4::class.java)
            startActivity(intent)



        }


        binding.science.setOnClickListener {

            val intent = Intent(this, sciencegrade4topics::class.java)
            startActivity(intent)
        }

    }
}