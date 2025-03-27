package com.example.defendx

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        // Reference the BottomNavigationView
        val bottomNavigationView =
            findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottomNavigationView)

        // Set the selected item to "Home"
        bottomNavigationView.selectedItemId = R.id.nav_profile


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

                R.id.nav_profile -> {

                    val intent = Intent(this, Profile::class.java)
                    startActivity(intent)
                    finish()
                    true

                }
                R.id.nav_orders-> {
                    val intent = Intent(this, Checkout::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_home -> {
                    // Navigate to Wishlist activity
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.nav_orders->{
                    val intent = Intent(this, Checkout::class.java)
                    startActivity(intent)
                    finish()
                    true}

                else -> false
            }
        }
    }
}