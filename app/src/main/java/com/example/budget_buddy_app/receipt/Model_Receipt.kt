package com.example.budget_buddy_app.receipt

import com.example.budget_buddy_app.R
import com.example.budget_buddy_app.inc_exp.Model_Inc_Exp

class Model_Receipt(val nameReceipt: String, val dateRe: String,val category:String, val receiptImage: Int)
object MockList3 {

    fun getModel(): List<Model_Receipt> {


        val itemModel1 = Model_Receipt(
            "Erste Bank",
            "22.01.2023",
            "Private",
            R.drawable.ic_launcher_background
        )
        val itemModel2 = Model_Receipt(
            "Erste Bank",
            "22.01.2023",
            "Work",
            R.drawable.ic_launcher_background
        )
        val itemModel3 = Model_Receipt(
            "Erste Bank",
            "22.01.2023",
            "Shopping",
            R.drawable.ic_launcher_background
        )

        val itemList: ArrayList<Model_Receipt> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)




        return itemList
    }

}