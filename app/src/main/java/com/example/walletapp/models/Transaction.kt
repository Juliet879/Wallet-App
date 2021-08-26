package com.example.walletapp.models

data class Transaction(
    var description:String,
    var reference:  String,
    var date:String,
    var amount:Int,
    var transaction_type:String
)
