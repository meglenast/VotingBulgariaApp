package com.example.votingbulgariaapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSignIn = findViewById<Button>(R.id.signInBtn)
        btnSignIn.setOnClickListener {
            val intent = Intent(this, SignInNames::class.java)
            startActivity(intent)
        }

        val btnLogInWithCredentials = findViewById<Button>(R.id.logInCredBtn)
        btnLogInWithCredentials.setOnClickListener {
            val intent = Intent(this, LogInCredentials::class.java)
            startActivity(intent)
        }
    }
}