package com.example.historyappfinalised

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val user_age = findViewById<EditText>(R.id.editTextNumber)
        val historical_data = findViewById<TextView>(R.id.textView2)
        val generate = findViewById<Button>(R.id.button)
        val clear = findViewById<Button>(R.id.button2)
        }
    }
}