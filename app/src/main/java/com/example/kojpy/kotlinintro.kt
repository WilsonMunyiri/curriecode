package com.example.kojpy

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.kojpy.databinding.ActivityDashboardBinding
import com.example.kojpy.databinding.ActivityKotlinintroBinding



class kotlinintro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlinintro)





        val videoView = findViewById<VideoView>(R.id.kotlin_introduction_video)
        val packagename = "android.resource://" + getPackageName() +"/" + R.raw.kotlin_video
        val uri = Uri.parse(packagename)
        videoView.setVideoURI(uri)

        val mediacontorller = android.widget.MediaController(this)
        videoView.setMediaController(mediacontorller)


          val textview2:TextView=findViewById(R.id.toide)
        textview2.setOnClickListener {
            val openUrl=Intent(android.content.Intent.ACTION_VIEW)
            openUrl.data=Uri.parse("https://play.kotlinlang.org/")
            startActivity(openUrl)
        }



        }

    }









