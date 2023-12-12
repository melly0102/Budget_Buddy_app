package com.example.budget_buddy_app

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class PassswordActivity : AppCompatActivity() {
    lateinit var send: Button
    lateinit var mail: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passsword)
        send = findViewById(R.id.btn_send)
        mail = findViewById(R.id.email)

        send.setOnClickListener({
            emailValidator(mail)
            val intent = Intent(this, ChangePasswordActivity::class.java)
            startActivity(intent)
            //finish()
        })
    }

    fun emailValidator(etMail: EditText) {

        // extract the entered data from the EditText
        val emailToText = etMail.text.toString()

        //
        if (!emailToText.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailToText).matches()) {
            Toast.makeText(this, "An E-Mail has been sent to you !", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Invalid E-Mail. Please enter a valid Email address !", Toast.LENGTH_LONG).show()
        }
    }
}

