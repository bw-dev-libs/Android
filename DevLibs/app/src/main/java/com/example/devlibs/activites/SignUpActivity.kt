package com.example.devlibs.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.devlibs.R
import kotlinx.android.synthetic.main.sign_up.*
import retrofit.BackendAPI
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

       var retrofit = Retrofit.Builder()
           .baseUrl("https://dev-libs.herokuapp.com/api/")
           .addConverterFactory(GsonConverterFactory.create())
           .build()





        create_account.setOnClickListener{
            if(username_field_signin.text.toString() != "" && password_field_signin.text.toString() != "") {
                val goToMode = Intent(this, DashBoard::class.java)
                val username = username_field_signin.text.toString()
                goToMode.putExtra("qstring", username)
                startActivity(goToMode)
    }
    // temp function for project build out.

}}}


