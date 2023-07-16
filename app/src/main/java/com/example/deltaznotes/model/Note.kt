package com.example.deltaznotes.model

import androidx.annotation.StringRes

// Class that models what a note is
data class Note(
    @StringRes val headingResourceId: Int,
    @StringRes val contentResourceId: Int,
    val isPinned: Boolean
)
