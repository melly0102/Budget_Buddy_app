package com.example.budget_buddy_app.category

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.budget_buddy_app.MainActivity
import com.example.budget_buddy_app.R

class EditCategoryActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var deleteBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_category)
        deleteBtn = findViewById(R.id.deleteBtn)

        btn = findViewById(R.id.btn_save_edit_income)
        btn.setOnClickListener({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

        btn.setOnClickListener({
            finish()
        })


    }
}