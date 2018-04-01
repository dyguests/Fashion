package com.fanhl.fashion.ui.guide

import android.app.ActivityOptions
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.util.Pair
import com.fanhl.fashion.R
import com.fanhl.fashion.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        Handler().postDelayed({
            MainActivity.launch(this@WelcomeActivity, ActivityOptions.makeSceneTransitionAnimation(
                    this@WelcomeActivity,
                    Pair(img_logo, getString(R.string.transition_name_img_logo))
            ).toBundle())
            finishAfterTransition()
        }, 1000)
    }
}
