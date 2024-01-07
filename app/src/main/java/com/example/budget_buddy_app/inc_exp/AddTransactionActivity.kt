package com.example.budget_buddy_app.inc_exp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.budget_buddy_app.MainActivity
import com.example.budget_buddy_app.R
import com.example.budget_buddy_app.receipt.AddReceiptActivity

class AddTransactionActivity : AppCompatActivity() {

    lateinit var btnaddReceipt: Button
    lateinit var btnSaveInc:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_transaction)

        btnaddReceipt = findViewById(R.id.add_btn_addreceipt)
        btnSaveInc = findViewById(R.id.btn_save_add_income)


        btnaddReceipt.setOnClickListener({
            val intent = Intent(this, AddReceiptActivity::class.java)
            startActivity(intent)
        })
        btnSaveInc.setOnClickListener({
            //still sth done
            finish()
        })

    }
}
