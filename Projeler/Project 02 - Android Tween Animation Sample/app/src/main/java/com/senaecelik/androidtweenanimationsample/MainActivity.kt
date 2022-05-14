package com.senaecelik.androidtweenanimationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils

import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity(){

    private lateinit var translateButton : Button
    private lateinit var alphaButton: Button
    private lateinit var rotateButton: Button
    private lateinit var scaleButton: Button
    private lateinit var twenButton: Button
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        translateButton = findViewById(R.id.twen_translate)
        alphaButton = findViewById(R.id.twen_alpha)
        rotateButton = findViewById(R.id.twen_rotate)
        scaleButton = findViewById(R.id.twen_scale)
        twenButton = findViewById(R.id.twen)
        imageView = findViewById(R.id.image)
        val animTranslate= AnimationUtils.loadAnimation(this, R.anim.tween_translate)
        val animAlpha= AnimationUtils.loadAnimation(this, R.anim.twen_alpha)
        val animRotate= AnimationUtils.loadAnimation(this, R.anim.twen_rotate)
        val animScale= AnimationUtils.loadAnimation(this, R.anim.twen_scale)
        val animTwen= AnimationUtils.loadAnimation(this, R.anim.twen)


        translateButton.setOnClickListener{
            imageView.startAnimation(animTranslate)
        }

        alphaButton.setOnClickListener{
            imageView.startAnimation(animAlpha)
        }

        rotateButton.setOnClickListener{
            imageView.startAnimation(animRotate)
        }

        scaleButton.setOnClickListener {
            imageView.startAnimation(animScale)
        }
        twenButton.setOnClickListener {
            imageView.startAnimation(animTwen)
        }
    }

}