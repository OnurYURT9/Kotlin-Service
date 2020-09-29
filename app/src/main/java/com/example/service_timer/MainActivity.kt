package com.example.service_timer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.service_timer.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonbasla.setOnClickListener {

            startService(Intent(this@MainActivity,TimerService::class.java))

        }

        buttondur.setOnClickListener {

            stopService(Intent(this@MainActivity,TimerService::class.java))

        }
    }
}
