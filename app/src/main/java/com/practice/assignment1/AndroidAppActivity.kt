package com.practice.assignment1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class AndroidAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_app)

        val email = findViewById<ImageView>(R.id.email_img)
        email.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:mbilal254.m@gmail.com") // only email apps should handle this
                startActivity(intent)
        }

    }
}