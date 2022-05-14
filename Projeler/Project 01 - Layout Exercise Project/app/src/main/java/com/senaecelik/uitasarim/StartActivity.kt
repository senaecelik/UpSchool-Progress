package com.senaecelik.uitasarim

import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.senaecelik.uitasarim.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var dataBinding : ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_start)


        dataBinding.buttonSignIn.setOnClickListener(this)
        dataBinding.textSignUp.setOnClickListener(this)


    }

    override fun onClick(view: View?) {
        when(view?.id){
            dataBinding.buttonSignIn.id -> {
                val intent = Intent(this, PremiumActivity::class.java)
                startActivity(intent)
                finish()
            }
            dataBinding.textSignUp.id -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}