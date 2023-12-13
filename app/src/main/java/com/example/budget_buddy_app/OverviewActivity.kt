package com.example.budget_buddy_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.example.budget_buddy_app.R
import com.example.budget_buddy_app.category.AddCategoryActivity
import com.example.budget_buddy_app.category.DetailedCategoryActivity
import com.example.budget_buddy_app.inc_exp.DetailedListActivity

class OverviewActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var btnDetailedCategory: ImageButton
    lateinit var btnCalendar: ImageButton
    lateinit var btnArrow: ImageButton
    lateinit var btnAdd: ImageButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_overview)

        btnCalendar = findViewById(R.id.btn_overview_calendar)

        btnDetailedCategory = findViewById(R.id.btn_overview_category_detailed)
        btnArrow = findViewById(R.id.btn_overview_category_detailed)
        btnAdd = findViewById(R.id.btn_overview_add_category)
        btn = findViewById(R.id.btn_category_view)


        btnCalendar.setOnClickListener({
            Toast.makeText(this, "The calendar should open then", Toast.LENGTH_LONG).show()
        })
        btnDetailedCategory.setOnClickListener({
            val intent = Intent(this, DetailedCategoryActivity::class.java)
            startActivity(intent)
        })
        btnAdd.setOnClickListener({
            val intent = Intent(this, AddCategoryActivity::class.java)
            startActivity(intent)
        })
        btn.setOnClickListener({
            val intent = Intent(this, DetailedListActivity::class.java)
            startActivity(intent)
        })
        btnCalendar.setOnClickListener({
            Toast.makeText(this, "Calendar should then open", Toast.LENGTH_LONG).show()

        })
    }
}