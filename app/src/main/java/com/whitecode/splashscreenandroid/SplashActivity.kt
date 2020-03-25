package com.whitecode.splashscreenandroid

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import android.content.Intent
import android.os.Handler
//import com.whitecode.splashscreen.R


class SplashActivity : AppCompatActivity() {

    //Waktu dalam detik splashscreen
    private val SPLASH_TIME_OUT:Long = 3000 // 1 sec
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed({


            startActivity(Intent(this , MainActivity::class.java))

            val detailIntent = Intent(this,
                    MainActivity::class.java)
            startActivity(detailIntent)

            finish()
        }, SPLASH_TIME_OUT)
    }
}