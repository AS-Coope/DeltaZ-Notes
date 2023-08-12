package com.example.deltaznotes.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.deltaznotes.R
import com.example.deltaznotes.model.DetailsActivity
import com.example.deltaznotes.model.Note

// manages how each note is displayed in the recycler view by adapting the data
// from a note to something the recycler view can handle
class ItemAdapter(
    private val context: Context,
    private val notes: List<Note>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    // provides the blueprint of what a view holder for a single note comprises
    inner class ItemViewHolder(view: View): RecyclerView.ViewHolder(view), View.OnClickListener{
        val noteHeading: TextView = view.findViewById(R.id.note_heading)
        val noteContentsPreview: TextView = view.findViewById(R.id.note_contents_preview)

        init{
            view.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            // opening the details activity for a specific note that is clicked from the recyclerview
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("NOTE", adapterPosition)
            context.startActivity(intent)
        }
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