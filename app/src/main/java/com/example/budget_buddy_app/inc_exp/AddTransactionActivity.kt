package com.example.budget_buddy_app.inc_exp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.budget_buddy_app.MainActivity
import com.example.budget_buddy_app.R

class AddTransactionActivity : AppCompatActivity() {
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_transaction)

        btn = findViewById(R.id.btn_save_add_income)

        btn.setOnClickListener({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

    }
}
