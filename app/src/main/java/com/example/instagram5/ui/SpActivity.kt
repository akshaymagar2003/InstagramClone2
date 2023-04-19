package com.example.instagram5.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed
import com.example.instagram5.MainActivity
import com.example.instagram5.R

class SpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sp)
        supportActionBar?.hide()
        Handler(Looper.getMainLooper()).postDelayed(2000){
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}