package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.logo.alpha = 0.5f
        binding.logo.animate().setDuration(3000).alpha(1f).withEndAction{
            Toast.makeText(this, "Oke", Toast.LENGTH_SHORT).show()
            val intentSplash = Intent(this, Login::class.java)
            startActivity(intentSplash)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

    }

}