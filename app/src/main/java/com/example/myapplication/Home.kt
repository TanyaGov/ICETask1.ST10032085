package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {

    private lateinit var italianButton: Button
    private lateinit var afrikaansButton: Button
    private lateinit var zuluButton: Button
    private lateinit var frenchButton: Button
    private lateinit var germanButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        italianButton = findViewById(R.id.button)
        italianButton.setOnClickListener{
            var italianIntent=  Intent(this,ItalianHome::class.java)
            startActivity(italianIntent)
        }// end itallian button

        afrikaansButton = findViewById(R.id.button2)
        afrikaansButton.setOnClickListener{
            var afrikaansIntent=  Intent(this,AfrikaansHome::class.java)
            startActivity(afrikaansIntent)
        }// end afrikaans

        zuluButton = findViewById(R.id.button3)
         zuluButton.setOnClickListener{
            var zuluIntent=  Intent(this,ZuluHome::class.java)
            startActivity(zuluIntent)
        }// end zulu

        frenchButton = findViewById(R.id.button4)
        frenchButton.setOnClickListener{
            var frenchIntent=  Intent(this,FrenchHome::class.java)
            startActivity(frenchIntent)
        }

        germanButton = findViewById(R.id.button5)
        germanButton.setOnClickListener{
            var germanIntent=  Intent(this,GermanHome::class.java)
            startActivity(germanIntent)
        }


    }// end class
}// end