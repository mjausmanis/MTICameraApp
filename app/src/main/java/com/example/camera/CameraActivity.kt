package com.example.camera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.camera_activity)

        title = "KotlinApp"

        val button: Button = findViewById(R.id.GoToAudio)
        button.setOnClickListener {
            val intent = Intent(this@CameraActivity, AudioActivity::class.java)
            startActivity(intent)
        }
    }
}