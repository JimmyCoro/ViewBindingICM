package com.example.viewbindingicm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat
import java.text.Format

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val tvAltura:TextView = findViewById(R.id.tvAltura)
    }
}