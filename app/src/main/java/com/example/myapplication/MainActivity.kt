package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recel = findViewById<RecyclerView>(R.id.recycle)
    }
}
