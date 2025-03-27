package com.example.defendx

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val bottomNavigationView = findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottomNavigationView)

        val buyButton1 = findViewById<Button>(R.id.buyButton1)
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

                R.id.nav_profile ->{

                    val intent = Intent( this,Profile::class. java)
                    startActivity(intent)
                    finish()
                    true

                }
                else -> false
            }
        }
    }
}