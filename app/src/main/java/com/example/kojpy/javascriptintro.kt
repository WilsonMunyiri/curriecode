package com.example.kojpy

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class javascriptintro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_javascriptintro)

        val videoView = findViewById<VideoView>(R.id.java_video)
        val packagename = "android.resource://" + getPackageName() +"/" + R.raw.javascript
        val uri = Uri.parse(packagename)
        videoView.setVideoURI(uri)

        val mediacontorller = android.widget.MediaController(this)
        videoView.setMediaController(mediacontorller)


        val textview2: TextView =findViewById(R.id.toide2)
        textview2.setOnClickListener {
            val openUrl= Intent(Intent.ACTION_VIEW)
            openUrl.data=Uri.parse("https://www.programiz.com/java-programming/online-compiler/")
            startActivity(openUrl)
        }



    }
}




