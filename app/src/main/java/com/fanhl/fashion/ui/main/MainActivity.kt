package com.fanhl.fashion.ui.main

import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.transition.TransitionManager
import android.util.Pair
import android.view.LayoutInflater
import android.view.ViewGroup
import com.fanhl.fashion.R
import com.fanhl.fashion.ui.account.AccountActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root = LayoutInflater.from(this).inflate(R.layout.activity_main, null as ViewGroup?) as ConstraintLayout
        setContentView(root)

        ll_top.setOnClickListener {
            TransitionManager.beginDelayedTransition(root)
            guideline.layoutParams = (guideline.layoutParams as ConstraintLayout.LayoutParams).apply { guidePercent = 1f }
        }

        v_logo.setOnClickListener {
            //            TransitionManager.beginDelayedTransition(root)
//            guideline.layoutParams = (guideline.layoutParams as ConstraintLayout.LayoutParams).apply { guidePercent = .5f }

            AccountActivity.launch(this@MainActivity, ActivityOptions.makeSceneTransitionAnimation(
                    this@MainActivity,
                    Pair(ll_top, getString(R.string.transition_name_ll_top)),
                    Pair(v_logo, getString(R.string.transition_name_v_logo)),
                    Pair(img_logo, getString(R.string.transition_name_img_logo))
            ).toBundle())
        }
        ll_bottom.setOnClickListener {
            TransitionManager.beginDelayedTransition(root)
            guideline.layoutParams = (guideline.layoutParams as ConstraintLayout.LayoutParams).apply { guidePercent = 0f }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    companion object {
        fun launch(context: Context, bundle: Bundle? = null) {
            context.startActivity(Intent(context, MainActivity::class.java), bundle)
        }
    }
}
