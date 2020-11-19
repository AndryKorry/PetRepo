package com.vynokurov.petrepo.ui.splash

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.vynokurov.petrepo.MainActivity
import com.vynokurov.petrepo.R

class SplashActivity : AppCompatActivity() {

    private val timer = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            startActivity(MainActivity.newInstance(this))
            finish()
        }, timer)
    }
}
