package com.tatara.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.tatara.swoosh.R
import com.tatara.swoosh.model.Player
import com.tatara.swoosh.utilities.EXTRA_PLAYER

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        val search = findViewById<TextView>(R.id.searchLeagueText)
        if (player != null) {
            search.text = "Looking for ${player.league} ${player.skill} league near you..."
        }
    }
}