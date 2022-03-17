package com.example.foregroundserviceexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foregroundserviceexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.start.setOnClickListener {
            ForegroundService.startService(this, "Hey")
        }

        binding.stop.setOnClickListener {
            ForegroundService.stopService(this)
        }
    }
}