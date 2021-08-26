package com.example.walletapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.walletapp.models.Transaction

class TransactionRVAdapter(var transactionList:MutableList<Transaction>) :RecyclerView.Adapter<TransactionItemView>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionItemView {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.transaction_list_item,parent,false)
        return TransactionItemView(itemView)
    }

    override fun onBindViewHolder(holder: TransactionItemView, position: Int) {
        var currentTransaction = transactionList[position]
        holder.tvAmount.text = currentTransaction.amount.toString()
        holder.tvDate.text = currentTransaction.date
        holder.tvDescription.text = currentTransaction.description
        holder.tvReference.text = currentTransaction.reference
        holder.tvType.text = currentTransaction.transaction_type

        if (holder.tvType.text == "CREDIT"){
            holder.cvTransactions.cardBackgroundColor = "purple_500"
        }
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }
}
class TransactionItemView(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvReference = itemView.findViewById<TextView>(R.id.tvReference)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvDescription = itemView.findViewById<TextView>(R.id.tvDescription)
    var tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    var tvType = itemView.findViewById<TextView>(R.id.tvType)
    var cvTransactions = itemView.findViewById<CardView>(R.id.cvTransaction)

}