package com.example.testapp5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn4=findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener{
            val intent =Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
      supportFragmentManager.beginTransaction().replace(R.id.f5,BlankFragment4()).commit()

//        val btn1=findViewById<Button>(R.id.btn1)
//        val btn2=findViewById<Button>(R.id.btn2)
//        val btn3=findViewById<Button>(R.id.btn3)
//
//        btn1.setOnClickListener{
//            supportFragmentManager.beginTransaction().replace(R.id.f,BlankFragment1()).commit()
//        }
//        btn2.setOnClickListener{
//            supportFragmentManager.beginTransaction().replace(R.id.f,BlankFragment2()).commit()
//        }
//        btn3.setOnClickListener{
//            supportFragmentManager.beginTransaction().replace(R.id.f,BlankFragment3()).commit()
//        }


    }
}