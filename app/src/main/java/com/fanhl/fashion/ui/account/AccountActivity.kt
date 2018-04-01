package com.fanhl.fashion.ui.account

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.fanhl.fashion.R
import com.fanhl.fashion.ui.common.BaseActivity

class AccountActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
    }

    companion object {
        fun launch(context: Context, bundle: Bundle? = null) {
            context.startActivity(Intent(context, AccountActivity::class.java), bundle)
        }
    }
}
