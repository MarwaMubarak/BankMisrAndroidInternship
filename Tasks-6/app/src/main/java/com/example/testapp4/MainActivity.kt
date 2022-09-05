package com.example.testapp4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerview =findViewById<RecyclerView>(R.id.rec)
        recyclerview.layoutManager=LinearLayoutManager(this)
        val data = ArrayList<ItemViewModel>()
        for (i in 1..10) {
            data.add(ItemViewModel("Item $i",R.drawable.shape1))
        }
        recyclerview.adapter = CustomAdapter(data)

        val btnClick =findViewById<Button>(R.id.btn)
        btnClick.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}