package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SignupPage : AppCompatActivity() {

    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)
        supportActionBar?.title = "Signup";

        registerButton=findViewById(R.id.Register)

        registerButton.setOnClickListener(){
            Toast.makeText(this, "Registered Successfully !", Toast.LENGTH_LONG).show()
        }


    }
}