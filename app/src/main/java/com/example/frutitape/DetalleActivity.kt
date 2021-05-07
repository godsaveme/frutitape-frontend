package com.example.frutitape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DetalleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)
        supportActionBar?.hide()

        findViewById<ImageView>(R.id.back2).setOnClickListener {
            super.onBackPressed();
        }
    }
}