package ru.gb.firstkotlinapp

import android.util.Log

data class Note(var title: String = "Заметка по умолчанию", var note: String = "просто заметка")

object Database {
    fun getNotesCycle() {
        val notes = listOf("note1", "note2", "note3", "note4", "note5", "note6", "note7")
        notes.forEach { note: String ->
            Log.d("mylogs", "$note from getNotesCycle")
        }

        repeat(10) {
            Log.d("mylogs", "$it from getNotesCycle")
        }
    }
}
