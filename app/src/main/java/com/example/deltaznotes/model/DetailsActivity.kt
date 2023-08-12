package com.example.deltaznotes.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deltaznotes.R
import com.example.deltaznotes.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}