package com.senaecelik.uitasarim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.senaecelik.uitasarim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var dataBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        dataBinding.buttonStartNow.setOnClickListener (this)
        }

    override fun onClick(view: View?) {
        when(view?.id){
            dataBinding.buttonStartNow.id -> {
                val intent = Intent(this, StartActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }


}
