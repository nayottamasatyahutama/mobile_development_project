package com.nayottama.livecoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var actionBar = getSupportActionBar()

        actionBar?.setHomeAsUpIndicator(R.drawable.chevron_left_1);
        actionBar?.setDisplayHomeAsUpEnabled(true);

        val login = findViewById(R.id.textLogin) as TextView
        login.setOnClickListener{
            startActivity(Intent(this, Login::class.java))
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