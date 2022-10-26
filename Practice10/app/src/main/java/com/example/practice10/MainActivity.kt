package com.example.practice10

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun invisibles(view: View){
        var button1 = findViewById<Button>(R.id.button1)
        var button2 = findViewById<Button>(R.id.button2)
        button1.setBackgroundColor(Color.TRANSPARENT)
        button2.setBackgroundColor(Color.RED)
    }

    fun visibles(view: View){
        var button1 = findViewById<Button>(R.id.button1)
        var button2 = findViewById<Button>(R.id.button2)
        button1.setBackgroundColor(Color.RED)
        button2.setBackgroundColor(Color.TRANSPARENT)
    }
}