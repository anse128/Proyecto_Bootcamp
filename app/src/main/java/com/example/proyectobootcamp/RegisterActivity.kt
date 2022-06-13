package com.example.proyectobootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
     /*   Handler().postDelayed({
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)*/
    }

}