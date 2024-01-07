package com.example.budget_buddy_app.category

class Model_Category(val name: String, val cause: String, val totalAmount: Int)


    object MockList {

        fun getModel(): List<Model_Category> {


            val itemModel1 = Model_Category(
                "Erste Bank",
                "work",
                2000
            )
            val itemModel2 = Model_Category(
                "Erste Bank",
                "Privat",
                2000
            )
            val itemModel3 = Model_Category(
                "Erste Bank",
                "Privat",
                2000
            )

            val itemModel4 = Model_Category(
                "Erste Bank",
                "Privat",
                2000
            )

            val itemList: ArrayList<Model_Category> = ArrayList()
            itemList.add(itemModel1)
            itemList.add(itemModel2)
            itemList.add(itemModel3)
            itemList.add(itemModel4)



            return itemList
        }

    }