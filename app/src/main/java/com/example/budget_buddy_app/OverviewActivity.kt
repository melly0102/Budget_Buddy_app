package com.example.budget_buddy_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.budget_buddy_app.category.AddCategoryActivity
import com.example.budget_buddy_app.category.DetailedCategoryActivity
import com.example.budget_buddy_app.category.MockList
import com.example.budget_buddy_app.category.Model_Category
import com.example.budget_buddy_app.inc_exp.DetailedListActivity


class OverviewActivity : AppCompatActivity() {
    lateinit var btn_category_view: Button
    lateinit var btnDetailedCategory: ImageButton
    lateinit var btnCalendar: ImageButton
    lateinit var btnArrow: ImageButton
    lateinit var btnAdd: ImageButton

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: Recycler_View_Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_overview)

        btnCalendar = findViewById(R.id.btn_overview_calendar)

        btnDetailedCategory = findViewById(R.id.btn_overview_category_detailed)
        btnArrow = findViewById(R.id.btn_overview_category_detailed)
        btnAdd = findViewById(R.id.btn_overview_add_category)
        btn_category_view = findViewById(R.id.btn_category_view)

        recyclerView = findViewById(R.id.normal_recycler)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = Recycler_View_Adapter(this, MockList.getModel() as ArrayList<Model_Category>)
        recyclerView.adapter = adapter



        adapter.setOnItemClickListener(object: Recycler_View_Adapter.onItemClickListenerInterface{
            override fun onItemClickListener(position: Int) {
                Toast.makeText(this@OverviewActivity, "You clicked on item number $position", Toast.LENGTH_LONG).show()
            }

        })
        /*
        var adapter1= Recycler_View_Adapter(this,MockList.getModel() as ArrayList<Model_Category>)
        recyclerView.adapter = adapter1
        adapter1.d
*/
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
        btn_category_view.setOnClickListener({
            val intent = Intent(this, DetailedListActivity::class.java)
            startActivity(intent)
        })
        btnCalendar.setOnClickListener({
            Toast.makeText(this, "Calendar should then open", Toast.LENGTH_LONG).show()

        })
    }

}