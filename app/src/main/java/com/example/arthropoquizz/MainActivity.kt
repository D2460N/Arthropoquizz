package com.example.arthropoquizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickBtnPlay(view:View) {
       val  intent = Intent(this,QuizzActivity::class.java)
        startActivity(intent)
    }
}
