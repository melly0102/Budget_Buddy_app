package com.example.budget_buddy_app.inc_exp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.budget_buddy_app.MainActivity
import com.example.budget_buddy_app.R

class EditInc_ExpActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var deleteBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_inc_exp)

        deleteBtn=findViewById(R.id.deleteBtn)

        btn = findViewById(R.id.btn_save_edit)
        btn.setOnClickListener({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

        btn.setOnClickListener({
            finish()
        })
    }
}