package com.example.votingbulgariaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInPhoto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_photo)

        val btnConfirmPhoto = findViewById<Button>(R.id.btnConfirm)
        btnConfirmPhoto.setOnClickListener {
            val intent = Intent(this, SignInExtraData::class.java)
            startActivity(intent)
        }

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, SignInID::class.java)
            startActivity(intent)
        }
    }
}