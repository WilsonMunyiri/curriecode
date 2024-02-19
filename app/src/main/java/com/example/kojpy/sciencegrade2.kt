package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivitySciencegrade2Binding

private lateinit var binding: ActivitySciencegrade2Binding
class sciencegrade2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySciencegrade2Binding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.chemistryimg.setOnClickListener {

            val intent = Intent(this, chemistrygrade2::class.java)
            startActivity(intent)


        }

        binding.physicsimg.setOnClickListener {

            val intent = Intent(this, physicsgrade2::class.java)
            startActivity(intent)


        }


        binding.biologyimg.setOnClickListener {

            val intent = Intent(this, biologygrade2::class.java)
            startActivity(intent)


        }





    }
}