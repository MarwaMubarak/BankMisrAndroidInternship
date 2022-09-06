package com.example.testapp5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn1=findViewById<Button>(R.id.btn1)
        val btn2=findViewById<Button>(R.id.btn2)
        val btn3=findViewById<Button>(R.id.btn3)

        btn1.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.f,BlankFragment1()).commit()
        }
        btn2.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.f,BlankFragment2()).commit()
        }
        btn3.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.f,BlankFragment3()).commit()
        }
    }
}