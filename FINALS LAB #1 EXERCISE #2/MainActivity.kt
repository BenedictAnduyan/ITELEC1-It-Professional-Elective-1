package com.example.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   
        val myTextView: TextView = findViewById(R.id.myTextview)
        val labelText: TextView = findViewById(R.id.labelText)
        val inputName: EditText = findViewById(R.id.inputName)
    }
}
