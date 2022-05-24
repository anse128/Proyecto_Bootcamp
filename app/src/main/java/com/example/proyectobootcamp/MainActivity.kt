package com.example.proyectobootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler().postDelayed({
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
       // setContentView(R.layout.activity_main)
    }


}