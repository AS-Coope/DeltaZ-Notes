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
        // an actual note object will have to be passed when the functionality for moving notes
        // around is implemented because then the id may be off [because it makes use of the adapter
        // position (the view holder that the item/note is in)
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