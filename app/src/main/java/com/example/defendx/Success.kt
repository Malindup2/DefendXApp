package com.example.defendx

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        Handler(Looper.getMainLooper()).postDelayed({
            finish() // Close the activity after 3 seconds
        }, 3000)
    }
}