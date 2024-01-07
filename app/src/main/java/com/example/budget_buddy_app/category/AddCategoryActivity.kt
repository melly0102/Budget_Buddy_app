package com.example.budget_buddy_app.category

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.budget_buddy_app.MainActivity
import com.example.budget_buddy_app.OverviewActivity
import com.example.budget_buddy_app.R

class AddCategoryActivity : AppCompatActivity() {
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_category)
        btn= findViewById(R.id.btn_save)

        btn.setOnClickListener({
            val intent = Intent(this, OverviewActivity::class.java)
            startActivity(intent)
        })

    }
}