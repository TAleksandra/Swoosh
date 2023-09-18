package com.tatara.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.tatara.swoosh.R
import com.tatara.swoosh.model.Player
import com.tatara.swoosh.utilities.EXTRA_PLAYER

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }
    fun beginnerClicked(view: View) {
        val ballerButton = findViewById<ToggleButton>(R.id.ballerBtn)
        ballerButton.isChecked = false
        player.skill = "beginner"
    }

    fun ballerClicked(view: View) {
        val beginnerButton = findViewById<ToggleButton>(R.id.beginnerBtn)
        beginnerButton.isChecked = false
        player.skill = "baller"
    }
    fun onFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)

        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}