package com.example.jafk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var joketext = ""
        var x  = Random.nextInt(0,10)
        var y:List<String> = listOf("Chuck Norris doesn't read books. He stares them down until he gets the information he wants.","Teenage Mutant Ninja Turtles is based on a true story: Chuck Norris once swallowed a turtle whole, and when he crapped it out, the turtle was six feet tall and had learned karate.","Most people have 23 pairs of chromosomes. Chuck Norris has 72... and they're all poisonous.","Chuck Norris once roundhouse kicked someone so hard that his foot broke the speed of light, went back in time, and killed Amelia Earhart while she was flying over the Pacific Ocean.","There is endless debate about the existence of the human soul. Well it does exist and Chuck Norris finds it delicious.","When Steven Seagal kills a ninja, he only takes its hide. When Chuck Norris kills a ninja, he uses every part.","Chuck Norris can skeletize a cow in two minutes.","Chuck Norris hosting is 101% uptime guaranteed.","Chuck Norris can download emails with his pick-up.","Chuck Norris can over-write a locked variable.")
        var z = 0
        var x1 = 0
        while (z!=9){
            if (x==z){
                joketext = y[x1]
                z=9
            }
            else{
                z+=1
                x1+=1
            }
            findViewById<Button>(R.id.button).text = joketext

        }
    }
    var x  = Random.nextInt(0,9)
    fun start1(view: View) {
        val randomIntent = Intent(this, jokes_item1::class.java)
        startActivity(randomIntent)
    }
}
class Joke {
    var y:List<String> = listOf("Chuck Norris doesn't read books. He stares them down until he gets the information he wants.","Teenage Mutant Ninja Turtles is based on a true story: Chuck Norris once swallowed a turtle whole, and when he crapped it out, the turtle was six feet tall and had learned karate.","Most people have 23 pairs of chromosomes. Chuck Norris has 72... and they're all poisonous.","Chuck Norris once roundhouse kicked someone so hard that his foot broke the speed of light, went back in time, and killed Amelia Earhart while she was flying over the Pacific Ocean.","There is endless debate about the existence of the human soul. Well it does exist and Chuck Norris finds it delicious.","When Steven Seagal kills a ninja, he only takes its hide. When Chuck Norris kills a ninja, he uses every part.","Chuck Norris can skeletize a cow in two minutes.","Chuck Norris hosting is 101% uptime guaranteed.","Chuck Norris can download emails with his pick-up.","Chuck Norris can over-write a locked variable.")
    var joke = y[(0 until y.size).random()]
}
