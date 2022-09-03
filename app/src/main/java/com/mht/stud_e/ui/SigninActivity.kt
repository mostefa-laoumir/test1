package com.mht.stud_e.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mht.stud_e.R

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        supportActionBar?.hide()
    }
}