package com.example.deltaznotes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.deltaznotes.R
import com.example.deltaznotes.model.Note

// manages how each note is displayed in the recycler view by adapting the data
// from a note to something the recycler view can handle
class ItemAdapter(
    private val notes: List<Note>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    // provides the blueprint of what a view holder for a single note comprises
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val noteHeading: TextView = view.findViewById(R.id.note_heading)
        val noteContentsPreview: TextView = view.findViewById(R.id.note_contents_preview)
    }

    // invoked by the layout mannager to create new viewholders
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = notes.size

    // called by the layout manager to replace the contents of a list item view
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = notes[position]

        // setting (or binding) the views in a particular viewholder
        holder.noteHeading.setText(item.headingResourceId)
        holder.noteContentsPreview.setText(item.contentResourceId)
    }
}