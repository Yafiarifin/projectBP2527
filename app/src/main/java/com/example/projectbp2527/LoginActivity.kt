package com.example.projectbp2527

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //intance
        val btnLogin:Button = findViewById(R.id.buttonlogin)

        //event
        btnLogin.setOnClickListener {
            val intent = Intent(this,HomeActivity2::class.java )
            startActivity(intent)
        }
    }
}