package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kojpy.databinding.ActivityAssignmentsBinding

private lateinit var binding: ActivityAssignmentsBinding

class assignments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAssignmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.grade1.setOnClickListener {

            val intent = Intent(this@assignments, gradeone::class.java)
            startActivity(intent)
        }

        binding.gradetwo.setOnClickListener {
            val intent = Intent(this, gradetwo::class.java)
            startActivity(intent)


        }

        binding.gradethree.setOnClickListener {
            val intent = Intent(this, gradethree::class.java)
            startActivity(intent)


        }

        binding.gradefour.setOnClickListener {
            val intent = Intent(this, gradefour::class.java)
            startActivity(intent)
        }





    }
}





