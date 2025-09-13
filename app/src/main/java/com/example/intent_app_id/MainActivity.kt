package com.example.intent_app_id

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intent_app_id.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var nama : String = "Mohammad Avirza Radyatanza"
    private var nim : String = "24/534267/SV/24022"
    private var hobby : String ="Playing music"
    private val editLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data = result.data
                nama = data?.getStringExtra("nama") ?: nama
                nim = data?.getStringExtra("nim") ?: nim
                hobby = data?.getStringExtra("hobby") ?: hobby

                binding.name.text = "$nama"
                binding.Nim.text = "$nim"
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.name.text = "$nama"
        binding.Nim.text = "$nim"

        with(binding){
            buttonDetails.setOnClickListener {

                val intentToSecondActivity = Intent(this@MainActivity, SecondActivity::class.java).apply{
                    putExtra("nama", nama)
                    putExtra("nim", nim)
                    putExtra("hobby", hobby)

                }
                startActivity(intentToSecondActivity)
            }

            buttonEdit.setOnClickListener {

                val intentToThirdActivity = Intent(this@MainActivity, ThirdActivity::class.java).apply {
                    putExtra("nama", nama)
                    putExtra("nim", nim)
                    putExtra("hobby", hobby)
                }
                editLauncher.launch(intentToThirdActivity)
            }


        }
    }
}