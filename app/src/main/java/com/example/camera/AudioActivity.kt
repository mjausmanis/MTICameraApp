package com.example.camera

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AudioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.audio_activity)
        title = "KotlinApp"
        val button: Button = findViewById(R.id.GoToCamera)
        button.setOnClickListener {
            val i = Intent(this@AudioActivity, CameraActivity::class.java)
            startActivity(i)
        }
    }
}