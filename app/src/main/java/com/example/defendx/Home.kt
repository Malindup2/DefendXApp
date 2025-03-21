package com.example.defendx

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Reference the BottomNavigationView
        val bottomNavigationView = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottomNavigationView)

        val buyButton1 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buyButton1)
        // Set the selected item to "Home"
        bottomNavigationView.selectedItemId = R.id.nav_home

        buyButton1.setOnClickListener {
            val intent = Intent(this, Product::class.java)
            startActivity(intent)
        }



        // Set up navigation listener
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_wishlist -> {
                    // Navigate to Wishlist activity
                    val intent = Intent(this, Wishlist::class.java)
                    startActivity(intent)
                    finish()
                    true
                }

                R.id.buyButton1 -> {
                    // Navigate to Wishlist activity
                    val intent = Intent(this, Product::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}