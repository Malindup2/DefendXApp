package com.example.defendx

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.defendx.R.*

class Checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_checkout)

        // Reference the Buy Button
        val finality = findViewById<androidx.appcompat.widget.AppCompatButton>(id.PayBtnLast)
        finality.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }

        // Reference the BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(id.bottomNavigationView)

        // Set the selected item to "Wishlist"
        bottomNavigationView.selectedItemId = id.nav_orders

        val backbutton = findViewById<ImageView>(id.backButton)
        backbutton.setOnClickListener {
            val intent = Intent(this, Product::class.java)
            startActivity(intent)
        }

        // Set up navigation listener
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {

                R.id.nav_home -> {
                    // Navigate to Wishlist activity
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    finish()
                    true

                }

                R.id.nav_wishlist -> {
                    // Navigate to Wishlist activity
                    val intent = Intent(this, Wishlist::class.java)
                    startActivity(intent)
                    finish()
                    true
                }

                R.id.nav_profile -> {
                    // Navigate to Wishlist activity
                    val intent = Intent(this, Profile::class.java)
                    startActivity(intent)
                    finish()
                    true
                }

                else -> {
                    false
                }
            }

            }



    }
}