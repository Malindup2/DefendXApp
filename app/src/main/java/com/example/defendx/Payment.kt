package com.example.defendx


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.defendx.R.*
import com.example.defendx.R.id.*

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_payment)

        val back = findViewById<ImageView>(backButton)
        back.setOnClickListener {
            val intent = Intent(this, Checkout::class.java)
            startActivity(intent)
            finish()
        }
        val Press = findViewById<Button>(payLKR)
        Press.setOnClickListener {
            val intent = Intent(this, Success::class.java)
            startActivity(intent)
            finish()


        }
    }
}