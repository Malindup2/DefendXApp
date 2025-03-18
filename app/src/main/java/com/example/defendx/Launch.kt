package com.example.defendx
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launching)

        // Delay for 2 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,OnboardingActivityOne::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}