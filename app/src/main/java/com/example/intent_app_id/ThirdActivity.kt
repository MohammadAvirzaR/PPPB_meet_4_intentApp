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

        val namabaru = intent.getStringExtra("nama")
        val nimbaru = intent.getStringExtra("nim")
        val hobbybaru = intent.getStringExtra("hobby")

        binding.edtName.setText(namabaru)
        binding.edtNim.setText(nimbaru)
        binding.edtHobby.setText(hobbybaru)
        with(binding){
            buttonDone.setOnClickListener {
                val resultIntent = Intent().apply {
                    putExtra("nama",edtName.text.toString())
                    putExtra("nim",edtNim.text.toString())
                    putExtra("hobby",edtHobby.text.toString())

                }


                setResult(Activity.RESULT_OK,resultIntent)
                finish()

            }



        }
    }
}