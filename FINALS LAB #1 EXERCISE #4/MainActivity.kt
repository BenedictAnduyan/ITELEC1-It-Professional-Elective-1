package com.example.mainactivity

import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // --- Spinner ---
        val spinner: Spinner = findViewById(R.id.spinner)
        val carItems = listOf("Toyota", "Chevrolet", "Honda", "BMW", "Ferrari")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, carItems)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = spinnerAdapter

        // --- AutoCompleteTextView ---
        val autoComplete: AutoCompleteTextView = findViewById(R.id.autoCompleteCountries)
        val countries = listOf("USA", "Canada", "UK", "Germany", "Japan", "Australia")
        val autoCompleteAdapter =
            ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, countries)
        autoComplete.setAdapter(autoCompleteAdapter)

        // --- Buttons ---
        val btnStandard: Button = findViewById(R.id.btnStandard)
        val btnImage: ImageButton = findViewById(R.id.btnImage)
        val btnToggle: ToggleButton = findViewById(R.id.btnToggle)

        btnStandard.setOnClickListener {
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }

        btnImage.setOnClickListener {
            Toast.makeText(this, "Image button was clicked", Toast.LENGTH_SHORT).show()
        }

        btnToggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "ON", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "OFF", Toast.LENGTH_SHORT).show()
            }
        }

        // --- Window Insets ---
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
