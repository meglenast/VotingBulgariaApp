package com.example.votingbulgariaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInID : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_id)

        val btnConfirmInput = findViewById<Button>(R.id.confirmIDInputBtn)
        btnConfirmInput.setOnClickListener {
            val intent = Intent(this, SignInPhoto::class.java)
            startActivity(intent)
        }
    }
}