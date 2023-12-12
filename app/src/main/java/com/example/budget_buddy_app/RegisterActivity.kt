package com.example.budget_buddy_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var passw1: EditText
    lateinit var passw2: EditText
    lateinit var btn_register: Button
    val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\$"
    val usernameRegex = "^[A-Za-z0-9+_.-]\$"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        name = findViewById(R.id.username)
        email = findViewById(R.id.email)
        passw1 = findViewById(R.id.password)
        passw2 = findViewById(R.id.passwordConfirm)

        btn_register = findViewById(R.id.btn_register)

        btn_register.setOnClickListener {
            (
                     if (!email.text.contains(emailRegex)) {
                        Toast.makeText(this, "Please enter a valid E-Mail", Toast.LENGTH_SHORT).show()

                    } else if (!(passw1.text.toString() == passw2.text.toString())) {

                        Toast.makeText(this, "The passwords don't match. ", Toast.LENGTH_SHORT).show()


                    } else {
                        finish()
                        Toast.makeText(this, "There is something wrong ", Toast.LENGTH_SHORT).show()
                    })

        }
    }
}

