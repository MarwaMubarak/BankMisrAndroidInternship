package com.example.testapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val registerButton =findViewById<Button>(R.id.register)
        registerButton.setOnClickListener{
            val intent =Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}