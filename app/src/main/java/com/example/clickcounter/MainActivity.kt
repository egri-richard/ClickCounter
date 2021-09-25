package com.example.clickcounter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Counter : TextView
    lateinit var plusButton : Button
    lateinit var minusButton: Button
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        plusButton.setOnClickListener {
            count++
            Counter.text = count.toString()
            if(count == 0) {Counter.setTextColor(Color.rgb(0, 0, 255))}
            if(count > 0) {Counter.setTextColor(Color.GREEN)}
        }

        minusButton.setOnClickListener {
            count--
            Counter.text = count.toString()
            if(count == 0) {Counter.setTextColor(Color.rgb(0, 0, 255))}
            if(count < 0) {Counter.setTextColor(Color.RED)}
        }

        Counter.setOnLongClickListener {
            count = 0
            Counter.text = count.toString()
            Counter.setTextColor(Color.rgb(0, 0, 255))
            return@setOnLongClickListener true
        }


    }

    fun init() {
        Counter = findViewById(R.id.Counter)
        plusButton = findViewById(R.id.plusButton)
        minusButton = findViewById(R.id.minusButton)

        Counter.setTextColor(Color.rgb(0, 0, 255))
    }
}