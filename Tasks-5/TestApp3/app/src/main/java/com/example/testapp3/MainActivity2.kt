package com.example.testapp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    var username1:EditText?=null
    var pass1:EditText?=null
    var fName:EditText?=null
    var lName:EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        username1 = findViewById(R.id.username1)
        pass1=findViewById(R.id.password1)
        fName=findViewById(R.id.firstName)
        lName=findViewById(R.id.lastName)
        val btnLogin=findViewById<Button>(R.id.loginBtn1)
        val btnRegister=findViewById<Button>(R.id.registerBtn1)

        btnLogin.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnRegister.setOnClickListener {
            val username1 = username1?.text
            val pass1 =pass1?.text
            val lName =lName?.text
            val fName =fName?.text

            if (TextUtils.isEmpty(username1)|| TextUtils.isEmpty(pass1)|| TextUtils.isEmpty(lName)|| TextUtils.isEmpty(fName)) {
                Toast.makeText(this, "Empty Field!!", Toast.LENGTH_SHORT)
                    .show()
            } else  {
                Toast.makeText(this, "Register..", Toast.LENGTH_SHORT)
                    .show()
            }



        }

    }




}