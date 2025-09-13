package com.example.intent_app_id

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intent_app_id.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            buttonDetails.setOnClickListener {

                val intentToSecondActivity = Intent(this@MainActivity, SecondActivity::class.java)
                intentToSecondActivity.putExtra("nama","Mohammad Avirza Radyatanzaa")
                intentToSecondActivity.putExtra("nim","24/534267/SV/24022")
                startActivity(intentToSecondActivity)
            }

            buttonEdit.setOnClickListener {

                val intentToThirdActivity = Intent(this@MainActivity, ThirdActivity::class.java)
                startActivity(intentToThirdActivity)
            }


        }
    }
}