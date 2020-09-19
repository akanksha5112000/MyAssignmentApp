package com.example.myassignmentapp
//Akanksha Vasudev Nagvenkar(PRN-18030121108)

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputMessage = findViewById<TextView>(R.id.inputMessage)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {

            val msg = inputMessage.text.toString()

            if (inputMessage.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter the message", Toast.LENGTH_SHORT).show()
            } else {

                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("Message:", msg)
                startActivity(intent)
                finish()

            }
        }
    }
}

