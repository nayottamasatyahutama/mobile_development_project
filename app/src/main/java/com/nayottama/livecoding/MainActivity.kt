package com.nayottama.livecoding

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button.setOnClickListener{
            startActivity(Intent(this, Login::class.java))
        }

        button2 = findViewById(R.id.button3)
        button2.setOnClickListener{
            startActivity(Intent(this, Register::class.java))
        }
    }
}