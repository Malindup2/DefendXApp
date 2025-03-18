package com.example.defendx

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class OnboardingActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard2)


        val nextArrow = findViewById<ImageView>(R.id.next_arrow)
        nextArrow.setOnClickListener {
            val intent = Intent(this, OnboardingActivityThree::class.java)
            startActivity(intent)
            finish()
        }
    }
}