package com.example.tugas1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas1.data.Latihan
import com.example.tugas1.data.Latihan2
import com.example.tugas1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        val edtText = binding.editTextTextPersonName.text

        binding.btnIntent.setOnClickListener {
            val data = edtText.toString()
            val intent = Intent(this, IntentActivity::class.java)
            intent.putExtra("nama", data)
            startActivity(intent)
        }

        binding.btnBundle.setOnClickListener {
            val intent = Intent(this, BundleActivity::class.java)
            val bundle = Bundle()
            val data = edtText.toString()


            bundle.putString("nama_bundle", data)
            intent.putExtras(bundle)
            startActivity(intent)

        }

        binding.btnSerializable.setOnClickListener {
            val data = edtText.toString()
            val intent = Intent(this, SerializableSampleActivity::class.java)
            val serializable = Latihan(data)
            intent.putExtra("nama",serializable)
            startActivity(intent)
        }

        binding.btnParcelable.setOnClickListener {
            val data = edtText.toString()
            val intent = Intent(this, ParcelableSampleActivity::class.java)
            val parcelable = Latihan2(data)
            intent.putExtra("nama",parcelable)
            startActivity(intent)
        }


    }
}