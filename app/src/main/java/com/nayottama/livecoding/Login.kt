package com.nayottama.livecoding

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var actionBar = getSupportActionBar()

        actionBar?.setHomeAsUpIndicator(R.drawable.chevron_left_1);
        actionBar?.setDisplayHomeAsUpEnabled(true);

        val register = findViewById(R.id.textView8) as TextView
        register.setOnClickListener{
            startActivity(Intent(this, Register::class.java))
        }
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}