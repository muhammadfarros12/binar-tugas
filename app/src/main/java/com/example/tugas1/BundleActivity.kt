package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.tugas1.databinding.ActivityBundleBinding

class BundleActivity : AppCompatActivity() {

    lateinit var binding: ActivityBundleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBundleBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val bundle = intent.extras
        val name = bundle?.getString("nama_bundle")
        binding.textView2.text = "Selamat $name anda telah bisa mengunakan bundle"

    }
}