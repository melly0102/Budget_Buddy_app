package com.example.budget_buddy_app.receipt


import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.budget_buddy_app.R
import com.example.budget_buddy_app.inc_exp.AddTransactionActivity


class AddReceiptActivity : AppCompatActivity() {
    lateinit var btnSaveAddReceips: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_receipt)

       // button_saveAddReceipts
        btnSaveAddReceips = findViewById(R.id.btn_save_add_receipts)
        btnSaveAddReceips.setOnClickListener({
            val intent = Intent(this, ListReceiptActivity::class.java)
            startActivity(intent)
        })

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