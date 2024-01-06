package com.example.budget_buddy_app

import kotlin.properties.Delegates

open class Categories {

    private lateinit var name: String
    private lateinit var cause: String
    var totalAmountMutable: Long = 0
        private set

    //Constructor
    constructor(name: String, cause: String, totalAmountMutable: Long) {
        this.name = name
        this.cause = cause
        this.totalAmountMutable = totalAmountMutable
    }

    //Getter and Setter

}