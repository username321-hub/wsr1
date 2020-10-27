package com.example.jafk

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewJokes : RecyclerView.Adapter<RecyclerViewJokes.ViewHolderJokes>() {

    var list = List(10){Joke()}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderJokes {
        var view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.jokes_item, parent, false)
        return ViewHolderJokes(view)
    }

    override fun onBindViewHolder(holder: ViewHolderJokes, position: Int) {
        holder.onBind(list[position])
    }
    override fun getItemCount(): Int{
        return list.size
    }
    class ViewHolderJokes(item: View) : RecyclerView.ViewHolder(item){
        var up:TextView = item.findViewById<TextView>(R.id.up)
        var down:TextView = item.findViewById<TextView>(R.id.down)

        fun onBind(joke : Joke){
            up.text = joke.joke.toString()
            down.text = joke.joke.toString()
        }
    }


}