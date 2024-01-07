package com.example.budget_buddy_app.receipt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.budget_buddy_app.R
import com.example.budget_buddy_app.Recycler_Inc
import com.example.budget_buddy_app.inc_exp.MockList2
import com.example.budget_buddy_app.inc_exp.Model_Inc_Exp

class ListReceiptActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.x_activity_list_receipt)

        recyclerView = findViewById(R.id.recycler_receipts)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = Recycler_View_ListReceipts(this, MockList3.getModel() as ArrayList<Model_Receipt>)
        recyclerView.adapter = adapter

    }
}