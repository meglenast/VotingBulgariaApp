package com.example.votingbulgariaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInPersonalDocuments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_personal_documents)

        val btnConfirmInput = findViewById<Button>(R.id.confirmDataInputBtn)
        btnConfirmInput.setOnClickListener {
            val intent = Intent(this, SignInID::class.java)
            startActivity(intent)
        }

    }
}