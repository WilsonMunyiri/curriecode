package com.example.kojpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.delay

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)



      Handler().postDelayed({

                            val intent=Intent(this, loginscreen::class.java)
                            startActivity(intent)
          finish()

      }, 4000)




    }
}