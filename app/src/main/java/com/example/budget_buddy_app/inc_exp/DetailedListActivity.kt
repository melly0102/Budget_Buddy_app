package com.example.budget_buddy_app.inc_exp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.budget_buddy_app.R
import com.example.budget_buddy_app.Recycler_Inc
import com.example.budget_buddy_app.Recycler_View_Adapter
import com.example.budget_buddy_app.category.MockList
import com.example.budget_buddy_app.category.Model_Category

class DetailedListActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.x_activity_detailed_list)

        recyclerView = findViewById(R.id.recycler_inc)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = Recycler_Inc(this, MockList2.getModel() as ArrayList<Model_Inc_Exp>)
        recyclerView.adapter = adapter

    }
}