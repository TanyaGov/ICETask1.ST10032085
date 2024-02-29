package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FrenchHome : AppCompatActivity() {

    private lateinit var englishButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_french_home)

        englishButton = findViewById(R.id.button)
        englishButton.setOnClickListener {
            var englishIntent = Intent(this, Home::class.java)
            startActivity(englishIntent)
        }// end english button


    }

}