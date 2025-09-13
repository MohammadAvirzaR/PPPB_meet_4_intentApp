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

    private var launcher =registerForActivityResult(ActivityResultContracts.StartActivityForResult()){result ->
        if (result.resultCode == Activity.RESULT_OK){

            val data = result.data
            val nama = data?.getStringExtra("name")
            val nim = data?.getStringExtra("Nim")
            val hobby = data?.getStringExtra("hobby")
            binding.name.text = "Name : $nama"
            binding.Nim.text = "Nim : $nim"
            binding.hobby.text = "Hobby : $hobby"
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var nama = intent.getStringExtra("nama")
        var nim = intent.getStringExtra("nim")
        with(binding){
            name.text = "Name : $nama"
            Nim.text = "Nim : $nim"

            buttonBack.setOnClickListener {
                finish()
            }

        }
    }
}