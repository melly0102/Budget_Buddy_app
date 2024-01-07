package com.example.budget_buddy_app.category

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.budget_buddy_app.MainActivity
import com.example.budget_buddy_app.OverviewActivity
import com.example.budget_buddy_app.R
import com.example.budget_buddy_app.R.*

class EditCategoryActivity : AppCompatActivity() {
    lateinit var btndelete: ImageButton
    lateinit var btnSaveEdit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_edit_category)
        btndelete = findViewById(id.deleteBtnEditCategory)
        btnSaveEdit = findViewById(id.btn_save_edit_category)


        btndelete.setOnClickListener({
            //Still to do delete entry
            val intent = Intent(this, OverviewActivity::class.java)
            startActivity(intent)
        })
        btnSaveEdit.setOnClickListener({
            finish()
        })


    }
}