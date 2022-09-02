package com.example.tugas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.tugas1.data.Latihan
import com.example.tugas1.databinding.ActivitySerializableSampleBinding

class SerializableSampleActivity : AppCompatActivity() {

    lateinit var binding: ActivitySerializableSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySerializableSampleBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val name = intent.getSerializableExtra("nama") as Latihan
        binding.textView3.text = "Selamat ${name.nama} sekarang anda telah menyelesaikan materi Serializable"

    }
}