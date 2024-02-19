package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivityMathtopicsgradetwo2Binding

private lateinit var binding: ActivityMathtopicsgradetwo2Binding
class mathtopicsgradetwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMathtopicsgradetwo2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.algebraimg.setOnClickListener {
            val intent= Intent(this, algebra2quiz::class.java)
            startActivity(intent)
        }

        binding.calculusimg.setOnClickListener {
            val intent= Intent(this, calculus2quiz::class.java)
            startActivity(intent)
        }

        binding.trigonometryimg.setOnClickListener {
            val intent= Intent(this, Trigonometry2quiz ::class.java)
            startActivity(intent)
        }





    }
}