package com.example.budget_buddy_app.inc_exp

import com.example.budget_buddy_app.R

class Model_Inc_Exp(val name_inc: String, val date: String, val amount: Int,val image:Int )
    object MockList2 {

        fun getModel(): List<Model_Inc_Exp> {


            val itemModel1 = Model_Inc_Exp(
                "Erste Bank",
                "22.01.2023",
                2000,
                R.drawable.ic_launcher_background
            )
            val itemModel2 = Model_Inc_Exp(
                "Erste Bank",
                "22.01.2023",
                2000,
                R.drawable.background_img
            )
            val itemModel3 = Model_Inc_Exp(
                "Erste Bank",
                "22.01.2023",
                2000,
                R.drawable.logo_background
            )

            val itemList: ArrayList<Model_Inc_Exp> = ArrayList()
            itemList.add(itemModel1)
            itemList.add(itemModel2)
            itemList.add(itemModel3)




            return itemList
        }

    }

