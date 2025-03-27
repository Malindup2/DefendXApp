package com.example.defendx


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Product : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        // Reference the BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Set the selected item to "Home"
        bottomNavigationView.selectedItemId = R.id.nav_home

        val buyButton = findViewById<Button>(R.id.productBuy)

        buyButton.setOnClickListener {
            val intent = Intent(this, Checkout::class.java)
            startActivity(intent)
        }


        val backbutton = findViewById<ImageView>(R.id.backButton)
        backbutton.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        // Set up navigation listener
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    // Navigate to Home activity
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

                R.id.buyButton1 -> {
                    // Navigate to Orders activity
                    val intent = Intent(this, Product::class.java)
                    startActivity(intent)
                    finish()
                    true
                }

                R.id.nav_profile -> {
                    // Navigate to Profile activity
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