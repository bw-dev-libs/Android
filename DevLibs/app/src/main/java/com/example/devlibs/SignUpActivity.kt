package com.example.devlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        create_account.text = intent.getStringExtra("LOGIN_INTENT_CODE")

        create_account.setOnClickListener{
            if(username_field_signin.text.toString() != "" && password_field_signin.text.toString() != "") {
                val goToMode = Intent(this, StorySelection::class.java)
                startActivity(goToMode)
    }
    // temp function for project build out.

}}}


