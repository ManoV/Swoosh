package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import com.example.swoosh.R.layout
import kotlinx.android.synthetic.main.activity_welcome.getStartedBtn

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
