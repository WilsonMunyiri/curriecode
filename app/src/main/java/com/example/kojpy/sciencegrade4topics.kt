package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivitySciencegrade4topicsBinding

private lateinit var binding: ActivitySciencegrade4topicsBinding


class sciencegrade4topics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySciencegrade4topicsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.biologyimg.setOnClickListener {
            val intent= Intent(this,biologyquiz::class.java )
            startActivity(intent)
        }


        binding.chemistryimg.setOnClickListener {
            val intent= Intent(this,chemistryquiz::class.java )
            startActivity(intent)
        }


        binding.physicsimg.setOnClickListener {
            val intent= Intent(this,physicsquiz::class.java )
            startActivity(intent)
        }








    }
}