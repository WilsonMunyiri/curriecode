package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kojpy.databinding.ActivityCalculusquizBinding
import com.example.kojpy.databinding.ActivityMathtopicsgrade1Binding

private lateinit var binding: ActivityMathtopicsgrade1Binding
class Mathtopicsgrade1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMathtopicsgrade1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.calculusimg.setOnClickListener {

            val intent = Intent(this, calculusquiz::class.java)
            startActivity(intent)

        }







    }
}