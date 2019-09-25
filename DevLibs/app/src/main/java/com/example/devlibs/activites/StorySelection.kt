package com.example.devlibs.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlibs.R
import kotlinx.android.synthetic.main.activity_story_selection.*

class StorySelection : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_selection)
        intent = Intent(this, programmerStoryWordSelection::class.java)
        funny_programmer.setOnClickListener{
            startActivity(intent)
        }
    }
}
