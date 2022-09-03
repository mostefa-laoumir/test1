package com.mht.stud_e.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mht.stud_e.R

class RequestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request)
        supportActionBar?.hide()
    }
}