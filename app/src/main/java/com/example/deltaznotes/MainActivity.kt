package com.example.deltaznotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.deltaznotes.adapter.ItemAdapter
import com.example.deltaznotes.data.DataSource
import com.example.deltaznotes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // gets the root view in activity_main.xml
        // root connects to all parent and child views, which allows ease of access
        // instead of having to reference each view by an individual findViewById

        val rowCount = 2
        val notes = DataSource().loadNotes()
        binding.recyclerView.layoutManager = GridLayoutManager(this, rowCount)

        binding.recyclerView.adapter = ItemAdapter(notes)
        binding.recyclerView.setHasFixedSize(true)
    }
}