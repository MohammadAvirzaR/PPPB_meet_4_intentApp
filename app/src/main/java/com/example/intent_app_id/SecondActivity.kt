package com.example.intent_app_id

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intent_app_id.databinding.ActivityMainBinding
import com.example.intent_app_id.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val nama = intent.getStringExtra("nama")
        val nim = intent.getStringExtra("nim")
        val hobby = intent.getStringExtra("hobby")
        binding.name.text = "Name : $nama"
        binding.Nim.text = "Nim : $nim"
        binding.hobby.text = "Hobby : $hobby"
        with(binding){

            buttonBack.setOnClickListener {
                finish()
            }

        }
    }
}