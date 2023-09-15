package com.tatara.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.tatara.swoosh.R
import com.tatara.swoosh.utilities.EXTRA_LEAGUE
import com.tatara.swoosh.utilities.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        val search = findViewById<TextView>(R.id.searchLeagueText)
        search.text = "Looking for $league $skill league near you..."
    }
}