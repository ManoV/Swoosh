package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.R.layout
import com.example.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.ballerSkillBtn
import kotlinx.android.synthetic.main.activity_skill.beginnerSkillBtn

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        skill = "Beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "Baller"
    }

    fun onSkillFinishClicked(view: View) {
        val finishIntent = Intent(this, FinishActivity::class.java)
        finishIntent.putExtra(EXTRA_LEAGUE, league)
        finishIntent.putExtra(EXTRA_SKILL, skill)
        startActivity(finishIntent)
    }
}
