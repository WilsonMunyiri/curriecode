package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kojpy.databinding.ActivityLoginscreenBinding
import com.google.firebase.auth.FirebaseAuth


private lateinit var binding: ActivityLoginscreenBinding
private lateinit var firebaseAuth: FirebaseAuth


class loginscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.signuploginscreenn.setOnClickListener {
            val intent = Intent(this@loginscreen, signup::class.java)
            startActivity(intent)


        }


        firebaseAuth = FirebaseAuth.getInstance()

        binding.Signinbtnloginscreen.setOnClickListener {

            val email = binding.emailloginscreen.text.toString()
            val password = binding.passwordloginscreen.text.toString()


            if (email.isNotEmpty() && password.isNotEmpty()) {


                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(this, dashboard::class.java)
                        startActivity(intent)

                    } else {
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                    }


                }
            } else {
                Toast.makeText(this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
            }


        }


    }
}





