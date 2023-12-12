package com.example.budget_buddy_app
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.budget_buddy_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    lateinit var btn_register:Button

    lateinit var textForgotPassw:Button

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString() == "user" && binding.password.text.toString() == "1234"){
                val intent = Intent(this, OverviewActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })
        btn_register = findViewById(R.id.btn_register)
        btn_register.setOnClickListener({
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)

        })


        textForgotPassw = findViewById(R.id.btn_forgotPassw)
        textForgotPassw.setOnClickListener({
            val intent = Intent(this, PassswordActivity::class.java)
            startActivity(intent)

        })
    }


}