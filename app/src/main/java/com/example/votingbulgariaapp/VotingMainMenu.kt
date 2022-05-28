package com.example.votingbulgariaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class VotingMainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voting_main_menu)

        val btn_Names = arrayOf<String>("Button1", "Button2", "Button3");


    }

    private fun initButtons() {
        val btn_Names = arrayOf<String>()
    }
}