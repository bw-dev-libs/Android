package com.example.devlibs.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlibs.R
import kotlinx.android.synthetic.main.activity_dash_board.*

class DashBoard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        add_story.setOnClickListener{
        var addStory = Intent(this, CreateStory::class.java)
        startActivity(addStory)}

        val extras = intent.extras?: return
        val qstring = extras.getString("qstring")
        temp_id.text = "Current User: $qstring "


        var activeStories = mutableListOf<String>()

        val addStory = intent.extras?: return
        val newStory = addStory.getString("newStory")

        activeStories.add(newStory!!)
        first_story.text = activeStories[0]
    }
}
