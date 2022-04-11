package ru.gb.firstkotlinapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import ru.gb.firstkotlinapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        val button: Button = findViewById(R.id.btn_first)
        button.setOnClickListener {
            textView.text = "Hello Kotlin!"
        }

        val note1 = Note("Первая заметка", "Текст первой заметки")
        val note2 = note1.copy()
        note2.title = "Не первая заметка"
        note2.note = "Текст следующей заметки"

        val textView1: TextView = findViewById(R.id.textView1)
        textView1.text = note2.title + " " + note2.note

        Database.getNotesCycle()
    }
}