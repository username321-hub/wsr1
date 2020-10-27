package com.example.jafk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class jokes_item1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jokes_item1)
        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = RecyclerViewJokes().apply {
            var a = 0
            var b = 0
            var c = 0
            while (a!=9){
                list[a]
                a+=1
            }
            list = List(10) { Joke() }
        }
        var x  = Random.nextInt(1,10)

        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}