package com.studies.mark.architecturecomponents.ui.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.studies.mark.architecturecomponents.R
import com.studies.mark.architecturecomponents.ui.BaseActivity
import com.studies.mark.architecturecomponents.ui.home.HomeActivity
import java.lang.Thread.sleep
import java.util.logging.Level
import java.util.logging.Logger

class MainActivity : BaseActivity() {

    companion object {
        val LOG = Logger.getLogger(MainActivity::class.java.name)
        const val SPLASH_TIME: Long = 1000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        hideSplashControl()
    }

    private fun hideSplashControl() {
        Thread {
            try {
                sleep(SPLASH_TIME)
            } catch (e: InterruptedException) {
                LOG?.log(Level.SEVERE, e.message)
            } finally {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }.run()
    }

}
