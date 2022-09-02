package com.example.tugas1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.tugas1.data.Latihan
import com.example.tugas1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val edtText = binding.editTextTextPersonName.text.toString()

        binding.btnIntent.setOnClickListener {
            val intent = Intent(this, IntentActivity::class.java)
            intent.putExtra("nama",edtText)
            startActivity(intent)
        }

        binding.btnBundle.setOnClickListener {
            val intent = Intent(this, BundleActivity::class.java)
            val bundle = Bundle()

            bundle.putString("nama_bundle",edtText)
            intent.putExtras(bundle)
            startActivity(intent)

        }

        binding.btnSerializable.setOnClickListener {
//            val intent = Intent(this, SerializableSampleActivity::class.java)
//            val serializable = Latihan(edtText)
//            intent.putExtra("nama",serializable)
//            startActivity(intent)
        }


    }
}