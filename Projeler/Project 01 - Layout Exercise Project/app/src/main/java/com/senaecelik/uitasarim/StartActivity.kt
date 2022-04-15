package com.senaecelik.uitasarim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class StartActivity : AppCompatActivity() {

    private lateinit var signInButton: Button
    private lateinit var signUpTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        signInButton = findViewById(R.id.button_sign_in)
        signUpTextView = findViewById(R.id.text_sign_up)
        signInButton.setOnClickListener{
            val intent = Intent(this, PremiumActivity::class.java)
            startActivity(intent)
            finish()
        }
        signUpTextView.setOnClickListener{
            val intent = Intent(this, PremiumActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}