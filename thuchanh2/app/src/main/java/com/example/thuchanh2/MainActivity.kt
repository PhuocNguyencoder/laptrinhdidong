package com.example.thuchanh2


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val messageText = findViewById<TextView>(R.id.messageText)
        val checkButton = findViewById<Button>(R.id.checkButton)

        checkButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()

            if (email.isEmpty()) {
                messageText.text = "Email không hợp lệ"
            } else if (!email.contains("@")) {
                messageText.text = "Email không đúng định dạng"
            } else {
                messageText.setTextColor(getColor(android.R.color.holo_green_dark))
                messageText.text = "Bạn đã nhập email hợp lệ"
            }
        }
    }
}
