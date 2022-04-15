package com.senaecelik.uitasarim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //Burada buttonu tanımladıktan sonra değer atama işlemini sonradan yapacağımızı söylüyoruz.
    //Aslında "bunun null olmadığını biliyorum, ama şu anda değer atamak istemiyorum.
    //Daha sonra değer ataması yapacağım, söz veriyorum" demektir.
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Burada buttonuma değer ataması yapıldı.
        button = findViewById(R.id.button_start_now)

        button.setOnClickListener{
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}