package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.tugas1.databinding.ActivityIntentBinding

class IntentActivity : AppCompatActivity() {

    lateinit var binding: ActivityIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val getData = intent.getStringExtra("nama")

        binding.textView.text = "Hello $getData"

    }
}