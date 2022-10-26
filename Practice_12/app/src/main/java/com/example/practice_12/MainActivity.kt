package com.example.practice_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageViewPear: ImageView = findViewById(R.id.imageView1)
    }

    fun loadButton_Click(view: View) {
        val imageViewPear: ImageView = findViewById(R.id.imageView1)
        imageViewPear.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.pr11_2))
    }

    var on: Boolean = true
    fun onClickImage(view: View)
    {
        val buttonImage: ImageButton = findViewById(R.id.imageButton)
        if(on)
        {
            buttonImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.btn_check_buttonless_off))
            on = false
        }
        else
        {
            buttonImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.btn_check_buttonless_on))
            on = true
        }
    }
}