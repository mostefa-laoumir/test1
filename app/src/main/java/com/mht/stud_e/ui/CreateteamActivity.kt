package com.mht.stud_e.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mht.stud_e.R

class CreateteamActivity : AppCompatActivity() {
    //this activity is to create teams
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_createteam)
        supportActionBar?.hide()
    }
}
