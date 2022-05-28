package com.example.votingbulgariaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogInEnterSecurityCodes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_enter_security_codes)

        val btnConfirmSecCOdes = findViewById<Button>(R.id.confirmSecBtn)
        btnConfirmSecCOdes.setOnClickListener {
            val intent = Intent(this, VotingMainMenu::class.java)
            startActivity(intent)
        }
    }
}