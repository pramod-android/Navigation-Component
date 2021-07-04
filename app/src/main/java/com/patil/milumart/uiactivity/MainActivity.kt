package com.patil.milumart.uiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patil.milumart.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}