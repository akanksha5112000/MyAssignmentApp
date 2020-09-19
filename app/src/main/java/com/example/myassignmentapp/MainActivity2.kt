package com.example.myassignmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var intent=intent
        val msg=intent.getStringExtra("Message:")

        val displayMess = findViewById<TextView>(R.id.displayMess)
        displayMess.text="Message: "+ msg
    }

    }
