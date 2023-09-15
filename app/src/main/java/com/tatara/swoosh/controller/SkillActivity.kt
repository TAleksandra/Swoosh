package com.tatara.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.tatara.swoosh.utilities.EXTRA_LEAGUE
import com.tatara.swoosh.R
import com.tatara.swoosh.utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
    }
    fun beginnerClicked(view: View) {
        val ballerButton = findViewById<ToggleButton>(R.id.ballerBtn)
        ballerButton.isChecked = false
        skill = "beginner"
    }

    fun ballerClicked(view: View) {
        val beginnerButton = findViewById<ToggleButton>(R.id.beginnerBtn)
        beginnerButton.isChecked = false
        skill = "baller"
    }
    fun onFinishClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)

        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}