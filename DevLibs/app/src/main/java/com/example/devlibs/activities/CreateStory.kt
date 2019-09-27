package com.example.devlibs.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlibs.R
import kotlinx.android.synthetic.main.activity_create_story.*

class CreateStory : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_story)
        var wordOne = word_1.text.toString()
        var wordTwo = word_2.text.toString()
        var wordThree = word_3.text.toString()
        var wordFour = word_4.text.toString()
        var wordFive = word_5.text.toString()
        var wordSix = word_6.text.toString()
        var wordSeven = word_7.text.toString()

        btn_create_story.setOnClickListener{
       var storyString = "$wordSix was $wordSeven in a $wordThree $wordTwo  that resembled what Alan Turing first described as a $wordFour herring, a classic but quite the pickle! If it\n" +
               "wasn't for his expertise in $wordOne he would feel just the same as when he first faced $wordFive!"

       var sendStory = Intent(this, DashBoard::class.java)
        sendStory.putExtra("newStory", storyString)
        startActivity(sendStory)}


    }
}
