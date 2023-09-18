package com.tatara.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.tatara.swoosh.R
import com.tatara.swoosh.model.Player
import com.tatara.swoosh.utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {

    var player = Player("", "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        val womensButton = findViewById<ToggleButton>(R.id.womensBtn)
        val coedButton = findViewById<ToggleButton>(R.id.coedBtn)
        womensButton.isChecked = false
        coedButton.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        val mensButton = findViewById<ToggleButton>(R.id.mensBtn)
        val coedButton = findViewById<ToggleButton>(R.id.coedBtn)
        mensButton.isChecked = false
        coedButton.isChecked = false
        player.league = "womens"
    }

    fun onCoedClicked(view: View) {
        val mensButton = findViewById<ToggleButton>(R.id.mensBtn)
        val womensButton = findViewById<ToggleButton>(R.id.womensBtn)
        mensButton.isChecked = false
        womensButton.isChecked = false
        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "PLease select a league", Toast.LENGTH_SHORT).show()
        }
    }
}