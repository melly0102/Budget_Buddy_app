package com.example.budget_buddy_app

import android.content.Intent
import android.os.Bundle
import android.text.BoringLayout
import android.text.TextUtils
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
            var emailValid = emailValidator(mail)

            if (TextUtils.isEmpty(mail.text.toString().trim()) && !emailValid) {
                mail.setError("An correct Email is required")
            } else {

                val intent = Intent(this, ChangePasswordActivity::class.java)
                startActivity(intent)
                //finish()
            }
        })

    }

    fun emailValidator(mail: EditText): Boolean {


        // extract the entered data from the EditText
        val emailToText = mail.text.toString()

        val isValidEmail = Patterns.EMAIL_ADDRESS.matcher(emailToText).matches()

        //
        if (isValidEmail) {
            Toast.makeText(this, "An E-Mail has been sent to you !", Toast.LENGTH_LONG)
                .show()
        } else {
            Toast.makeText(
                this,
                "Invalid E-Mail. Please enter a valid Email address !",
                Toast.LENGTH_LONG
            ).show()
        }
        return isValidEmail
    }
}

