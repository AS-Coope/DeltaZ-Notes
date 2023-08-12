package com.example.deltaznotes.model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.deltaznotes.data.DataSource
import com.example.deltaznotes.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private val loadedNotes = DataSource().loadNotes()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // acquiring the extra from the intent passed when the note in the recycler view was clicked
        val noteDetails = intent.getIntExtra("NOTE", -1)

        // searching for the specific note clicked in the recycler view
        fetchNotes(noteDetails)
    }

    private fun fetchNotes(notePosition: Int){
        // show information for the specific note clicked in the details activity
        binding.tvNoteTitle.setText(loadedNotes[notePosition].headingResourceId)
        binding.tvNoteDetails.setText(loadedNotes[notePosition].contentResourceId)
    }
}