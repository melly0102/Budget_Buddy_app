package com.example.budget_buddy_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var passw1: EditText
    lateinit var passw2: EditText
    lateinit var btn_register: Button
    lateinit var btnLogin: Button
    lateinit var arrowRedirect: ImageButton
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

        btnLogin = findViewById(R.id.btn_redirectSignIn)
        arrowRedirect = findViewById(R.id.arrowRedirect)

        arrowRedirect.setOnClickListener({
            finish();
        })

        btnLogin.setOnClickListener({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

        btn_register.setOnClickListener {


            if (TextUtils.isEmpty(name.text.toString().trim())) {

                name.setError("Name is required")

            } else if (TextUtils.isEmpty(email.text.toString())) {

                email.setError("Email is required")
            } else if (TextUtils.isEmpty(passw1.text.toString())) {

                passw1.setError("Password is required")
            } else if (TextUtils.isEmpty(passw2.text.toString())) {

                passw2.setError("Password confirmation is required")
            } else if (!passw1.text.toString().equals(passw2.text.toString())) {

                Toast.makeText(this, "The passwords don't match. ", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Register successful. ", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

