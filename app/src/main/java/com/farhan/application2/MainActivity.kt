package com.farhan.application2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.farhan.application2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val error: Int = 0;
    val requestCode = 3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button4.setOnClickListener {
            val intent = Intent()
            intent.action = "com.farhan.application1"
            intent.addCategory(Intent.CATEGORY_DEFAULT)
            try {
                startActivityForResult(intent, requestCode)
            } catch (e:Exception){
            binding.textView2.text = "Something is wrong $(e.message)"
        }
        }
    }
}