package com.example.budget_buddy_app.receipt


import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.budget_buddy_app.R


class AddReceiptActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.x_activity_add_receipt)

        val categorySpinner = findViewById<Spinner>(R.id.spinner)

        // Daten für das Dropdown-Menü erstellen

        // Daten für das Dropdown-Menü erstellen
        val categories: MutableList<String> = ArrayList()
        categories.add("Kategorie 1")
        categories.add("Kategorie 2")
        categories.add("Kategorie 3")

        // ArrayAdapter für das Dropdown-Menü erstellen

        // ArrayAdapter für das Dropdown-Menü erstellen
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // ArrayAdapter dem Spinner zuweisen

        // ArrayAdapter dem Spinner zuweisen
        categorySpinner.adapter = adapter
    }
}