package com.pamela.gads

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*

class NoteRecyclerAdapter( private val context: Context, private val notes:List<NoteInfo>)
    : RecyclerView.Adapter<NoteRecyclerAdapter.ViewHolder>(){

    private val layoutInflater= LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //This method is used to create the view that we need

        var itemView = layoutInflater.inflate(R.layout.item_note_list, parent, false)
        // each time the onCreate View Holder is called, well inflate the layout recourse to create another view instance
        // that we can use within the recycler view
        return ViewHolder(itemView)
        // we then construct our view holder, passing in that reference to the view going inside the viewholder class
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //it is responsible for displaying the data
        val note = notes[position]
        holder.textCourse?.text= note.course.title
        holder.textTitle?.text=note.title
    }
    override fun getItemCount(): Int {
      //shows how much data needs to be displayed
    }
    class ViewHolder (itemView: View?): RecyclerView.ViewHolder(itemView!!) {
        // Here we get reference to the text we are to use in that particular view holder
        //the item to be displayed in the views include textcourse and the text title; hence;
        var textCourse =itemView?.findViewById<TextView?>(R.id.textCourse)
        var textTitle=itemView?.findViewById<TextView?>(R.id.textTitle)

    }
}