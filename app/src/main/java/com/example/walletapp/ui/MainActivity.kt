package com.example.walletapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.walletapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSubmit.setOnClickListener {
            var intent = Intent(baseContext, TransactionActivity::class.java)
            intent.putExtra("name" , binding.etName.text.toString())
            intent.putExtra("currency" , binding.etCurrency.text.toString())
            startActivity(intent)
        }
    }
}