package com.example.votingbulgariaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogInCredentials : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_credentials)

        val btnConfirmCredentials = findViewById<Button>(R.id.confirmCredBtn)
        btnConfirmCredentials.setOnClickListener {
            val intent = Intent(this, LogInEnterSecurityCodes::class.java)
            startActivity(intent)
        }
    }
}