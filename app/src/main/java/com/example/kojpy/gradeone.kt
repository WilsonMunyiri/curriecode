package com.example.kojpy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kojpy.databinding.ActivityGradeoneBinding

private lateinit var binding: ActivityGradeoneBinding

class gradeone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGradeoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mathematics.setOnClickListener {

            val intent = Intent(this@gradeone, Mathtopicsgrade1::class.java)
            startActivity(intent)



            }


        binding.science.setOnClickListener {

            val intent = Intent(this@gradeone, sciencetopicsgrade1::class.java)
            startActivity(intent)}



        }




    }
