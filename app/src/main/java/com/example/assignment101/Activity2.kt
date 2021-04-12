package com.example.assignment101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var textView: TextView = findViewById(R.id.tv)
        var message = intent.getStringExtra("ACTIVE")

        textView.text = if (message == null) {
            "INACTIVE"
        }else message
    }
}