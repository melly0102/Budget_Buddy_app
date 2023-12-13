package com.example.budget_buddy_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class ChangePasswordActivity : AppCompatActivity() {
    lateinit var password2 : EditText
    lateinit var password1: EditText
    lateinit var btn_reset: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)

        btn_reset = findViewById(R.id.btn_reset)
        password1 = findViewById(R.id.password1)
        password2 = findViewById(R.id.password2)

        btn_reset.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            /* if (password1.text.toString() == password2.text.toString()){

                // Finish the current activity (optional, depending on your use case)
                finish()
                Toast.makeText(this, "Password reset successful", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "The passwords don't match..", Toast.LENGTH_SHORT).show()
            }
        })*/
        })
    }
}
    /* private lateinit var binding: ActivityMainBinding
     lateinit var password2 : EditText
     lateinit var password1: EditText
     lateinit var btn_reset: Button
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
         btn_reset.setOnClickListener(View.OnClickListener {
             if (password1.text.toString() == password2.text.toString()){
                 val intent = Intent(this, OverviewActivity::class.java)
                 startActivity(intent)

                 // Finish the current activity (optional, depending on your use case)
                 finish()
                 Toast.makeText(this, "Password reset successful", Toast.LENGTH_SHORT).show()

             } else {
                 Toast.makeText(this, "The passwords don't match..", Toast.LENGTH_SHORT).show()
             }
         })
     }*/
