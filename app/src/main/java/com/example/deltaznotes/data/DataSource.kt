package com.example.deltaznotes.data

import com.example.deltaznotes.R
import com.example.deltaznotes.model.Note

// take the various parts of the data (basically the Note is a data structure)
// and format it so that it appears as a note should, on screen
class DataSource {

    fun loadNotes(): List<Note>{
        return listOf(
            Note(R.string.note1_heading, R.string.note1_contents, false),
            Note(R.string.note2_heading, R.string.note2_contents, false),
            Note(R.string.note3_heading, R.string.note3_contents, false),
            Note(R.string.note4_heading, R.string.note4_contents, false),
            Note(R.string.note5_heading, R.string.note5_contents, false),
            Note(R.string.note6_heading, R.string.note6_contents, false),
            Note(R.string.note7_heading, R.string.note7_contents, false)
        )
    }
}