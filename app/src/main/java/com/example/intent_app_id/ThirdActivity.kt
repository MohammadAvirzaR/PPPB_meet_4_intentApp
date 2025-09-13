package com.example.intent_app_id

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intent_app_id.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            buttonDone.setOnClickListener {
                val resultIntent = Intent()
                resultIntent.putExtra("name",edtName.text.toString())
                resultIntent.putExtra("Nim",edtNim.text.toString())
                resultIntent.putExtra("hobby",edtHobby.text.toString())

                setResult(Activity.RESULT_OK,resultIntent)
                finish()

            }



        }
    }
}