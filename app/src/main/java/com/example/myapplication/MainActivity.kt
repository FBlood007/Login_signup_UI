package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var userName: EditText
    private lateinit var password: EditText
    private lateinit var loginButton: Button
    private lateinit var signupButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName= findViewById(R.id.FullName)
        password= findViewById(R.id.Password)
        loginButton= findViewById(R.id.login)
        signupButton=findViewById(R.id.signUp)

        loginButton.setOnClickListener {
            val userTextInput=userName.text.toString()
            val userPasswordInput=password.text.toString()
            checkCredintials(userTextInput,userPasswordInput)

        }
        signupButton.setOnClickListener{
            openSignUp()
        }

    }
    private fun openSignUp(){
        val intent = Intent(this,SignupPage::class.java)
        startActivity(intent)
    }



    private fun checkCredintials(userTextInput: String, userPassword:String) {
        if (userTextInput == "admin" && userPassword == "1234"){
            Toast.makeText(this, "Credential matched", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this,"Wrong Credential",Toast.LENGTH_LONG).show()
        }
    }

}