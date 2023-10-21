package com.practice.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val androidCard = findViewById<CardView>(R.id.android_card)
        androidCard.setOnClickListener{
            val intent = Intent(applicationContext,AndroidAppActivity::class.java)
            startActivity(intent)
        }

        val webCard = findViewById<CardView>(R.id.web_card)
        webCard.setOnClickListener{
            val intent = Intent(applicationContext,WebAppActivity::class.java)
            startActivity(intent)
        }

        val iosCard = findViewById<CardView>(R.id.ios_card)
        iosCard.setOnClickListener{
            val intent = Intent(applicationContext,IosAppActivity::class.java)
            startActivity(intent)
        }

        val uiuxCard = findViewById<CardView>(R.id.uiux_card)
        uiuxCard.setOnClickListener{
            val intent = Intent(applicationContext,UiUxActivity::class.java)
            startActivity(intent)
        }

        val graphicCard = findViewById<CardView>(R.id.graphic_card)
        graphicCard.setOnClickListener{
            val intent = Intent(applicationContext,GraphicActivity::class.java)
            startActivity(intent)
        }

        val videoCard = findViewById<CardView>(R.id.video_card)
        videoCard.setOnClickListener{
            val intent = Intent(applicationContext,VideoActivity::class.java)
            startActivity(intent)
        }

    }
}