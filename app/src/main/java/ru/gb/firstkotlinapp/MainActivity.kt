package ru.gb.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gb.firstkotlinapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}