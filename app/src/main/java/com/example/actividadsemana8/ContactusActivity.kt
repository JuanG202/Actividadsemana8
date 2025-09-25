package com.example.actividadsemana8

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ContactusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contactus)

        val btnBack: Button = findViewById(R.id.btnBack)
        btnBack.setOnClickListener { finish() }

    }
}