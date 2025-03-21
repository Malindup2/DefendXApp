package com.example.defendx

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.defendx.R.*

class Checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_checkout)

        // Reference the Buy Button
        val finality  = findViewById<androidx.appcompat.widget.AppCompatButton>(id.PayBtnLast)
        finality.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }


    }
}