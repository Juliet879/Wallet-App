package com.example.walletapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.walletapp.models.Transaction
import com.example.walletapp.TransactionRVAdapter
import com.example.walletapp.databinding.ActivityTransactionBinding

class TransactionActivity : AppCompatActivity() {
    lateinit var binding: ActivityTransactionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransactionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var nameIntent = intent.getStringExtra("name")
        var currencyIntent = intent.getStringExtra("currency")

        binding.tvAccName.text = nameIntent
        binding.tvAccCurrency.text = currencyIntent

        var transactions = mutableListOf(
            Transaction("deposited","MSAJDBAD","21-02-2010",7004300,"DEBIT"),
            Transaction("deposited","WY4YW","21-02-2010",2132,"CREDIT"),
            Transaction("withdrawal","WEGWGSD","21-02-2010",400,"CREDIT"),
            Transaction("deposited","HTFHDF","21-02-2010",70000,"DEBIT"),
            Transaction("deposited","HRERH","21-02-2010",124142,"CREDIT"),
            Transaction("deposited","MSAJDBAD","21-02-2010",324,"DEBIT"),
            Transaction("withdrwal","WEHSHE","21-02-2010",2141,"CREDIT"),
            Transaction("withdrawal","MSAJDBAD","21-02-2010",70000,"CREDIT"),
            Transaction("deposited","SWHRS","21-02-2010",23525,"DEBIT"),
            Transaction("deposited","HREFSBRHE","21-02-2010",2322,"DEBIT"),
        )

        binding.rvTransactions.adapter = TransactionRVAdapter(transactions)
        binding.rvTransactions.layoutManager = LinearLayoutManager(baseContext)

    }
}