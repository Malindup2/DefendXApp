package com.example.defendx


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class OnboardingActivityOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard1)

        // Next arrow click listener
        val nextArrow = findViewById<ImageView>(R.id.next_arrow)
        nextArrow.setOnClickListener {
            val intent = Intent(this, OnboardingActivityTwo::class.java) // Go to MainActivity
            startActivity(intent)
            finish()
        }
    }
}