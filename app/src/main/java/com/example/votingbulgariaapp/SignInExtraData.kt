package com.example.votingbulgariaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInExtraData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_extra_data)

        val btnConfirmInput = findViewById<Button>(R.id.confirmExtraDataBtn)
        btnConfirmInput.setOnClickListener {
            val intent = Intent(this, SignInAuthentication::class.java)
            startActivity(intent)
        }
    }
}