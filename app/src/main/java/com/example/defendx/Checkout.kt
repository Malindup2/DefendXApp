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

        // Reference the BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(id.bottomNavigationView)

        // Set the selected item to "Orders"
        bottomNavigationView.selectedItemId = id.nav_orders


        // Reference the Buy Button
        val finality  = findViewById<androidx.appcompat.widget.AppCompatButton>(id.BuyButton)
        finality.setOnClickListener {
            val intent = Intent(this, Checkout::class.java)
            startActivity(intent)
        }

        // Set up navigation listener
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                id.nav_home -> {
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                id.nav_wishlist -> {
                    val intent = Intent(this, Wishlist::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                id.nav_orders -> {
                    val intent = Intent(this, Checkout::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                id.nav_profile -> {
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}