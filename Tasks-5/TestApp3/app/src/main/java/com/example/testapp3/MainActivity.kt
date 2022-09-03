package com.example.testapp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var username:EditText? =null
    var pass:EditText? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.username)
        pass=findViewById(R.id.password)
        val btnLogin=findViewById<Button>(R.id.loginBtn)
        val btnRegister=findViewById<Button>(R.id.registerBtn)
        btnRegister.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            val username = username?.text
            val pass =pass?.text
            if (TextUtils.isEmpty(username)||TextUtils.isEmpty(pass)) {
                Toast.makeText(this, "Empty Field!!", Toast.LENGTH_SHORT)
                    .show()
            } else  {
                Toast.makeText(this, "Login..", Toast.LENGTH_SHORT)
                    .show()
            }


        }
        }

    }

