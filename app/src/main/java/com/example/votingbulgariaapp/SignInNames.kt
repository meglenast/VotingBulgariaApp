package com.example.votingbulgariaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInNames : AppCompatActivity() {

    //tbd : Save data while switching layouts
    var fstName: String = ""
    var sndName: String = ""
    var lastName: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_names)

        val btnConfirmNamesInput = findViewById<Button>(R.id.confirmNamesInputBtn)
        btnConfirmNamesInput.setOnClickListener {
            val intent = Intent(this, SignInPersonalDocuments::class.java)
            startActivity(intent)
        }
    }
}