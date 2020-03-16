package com.example.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R.layout
import com.example.swoosh.model.Player
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.searchLeaguesTxt

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeaguesTxt.text = "Looking for a ${player.league} ${player.skill} near you"
    }
}
