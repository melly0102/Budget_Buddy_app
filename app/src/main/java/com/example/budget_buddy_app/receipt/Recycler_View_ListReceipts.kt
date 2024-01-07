package com.example.budget_buddy_app.receipt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.budget_buddy_app.R
import com.example.budget_buddy_app.Recycler_Inc
import com.example.budget_buddy_app.inc_exp.Model_Inc_Exp

class Recycler_View_ListReceipts(final var context: Context, val itemList: ArrayList<Model_Receipt>) :
RecyclerView.Adapter<Recycler_View_ListReceipts.ModelViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Recycler_View_ListReceipts.ModelViewHolder {

        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_rec_receipts, parent, false)
        return ModelViewHolder(v)
    }

    override fun onBindViewHolder(holder: Recycler_View_ListReceipts.ModelViewHolder, position: Int) {

        holder.ItemImageRe.setOnClickListener({
            Toast.makeText(context,"Delete Icon", Toast.LENGTH_LONG).show()
            itemList.removeAt(position)
            this.notifyDataSetChanged()
            Toast.makeText(context,"Delete Icon", Toast.LENGTH_LONG).show()
        })



        holder.ItemNameRe.setText(itemList[position].nameReceipt)
        holder.ItemDateRe.setText(itemList[position].dateRe)
        holder.ItemCategoryRe.setText(itemList[position].category)
        holder.ItemImageRe.setImageResource(itemList[position].receiptImage)

    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    inner class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var ConstraintLayt: ConstraintLayout
        var ItemImageRe: ImageView


        var ItemNameRe: TextView
        var ItemDateRe: TextView
        var ItemCategoryRe: TextView


        init {
            ConstraintLayt = itemView.findViewById(R.id.reLayoutInc) as ConstraintLayout
            ItemImageRe = itemView.findViewById(R.id.deleteRCRE) as ImageView

            ItemNameRe = itemView.findViewById(R.id.nameRCRE) as TextView
            ItemDateRe = itemView.findViewById(R.id.dateRCRE) as TextView
            ItemCategoryRe = itemView.findViewById(R.id.categoryRCRE ) as TextView

        }

    }

}