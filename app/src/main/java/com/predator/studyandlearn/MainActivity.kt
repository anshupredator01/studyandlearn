package com.predator.studyandlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonClick = findViewById<Button>(R.id.mcq)
        val buttonClick2 = findViewById<Button>(R.id.simple)
        val buttonClick3 = findViewById<Button>(R.id.chapter)
        val buttonClick4 = findViewById<Button>(R.id.more)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
        buttonClick2.setOnClickListener {
            val intent = Intent(this, Simple::class.java)
            startActivity(intent)
        }
        buttonClick3.setOnClickListener {
            val intent = Intent(this, chapter::class.java)
            startActivity(intent)
        }
        buttonClick4.setOnClickListener {
            val intent = Intent(this, more::class.java)
            startActivity(intent)
        }
    }
}