package com.example.tugas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.tugas1.data.Latihan2
import com.example.tugas1.databinding.ActivityParcelableSampleBinding

class ParcelableSampleActivity : AppCompatActivity() {

    lateinit var binding: ActivityParcelableSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParcelableSampleBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val name = intent.getParcelableExtra<Latihan2>("nama") as Latihan2
        binding.textView4.text = "Selamat ${name.name}, kamu sudah mencoba passing data menggunakan parcelable"

    }
}