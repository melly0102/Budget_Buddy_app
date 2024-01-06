package com.example.budget_buddy_app

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.widget.Toast
import com.example.budget_buddy_app.inc_exp.Model_Inc_Exp

class Recycler_Inc(final var context: Context, val itemList: ArrayList<Model_Inc_Exp>) :
    RecyclerView.Adapter<Recycler_Inc.ModelViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Recycler_Inc.ModelViewHolder {

        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_rec_inc, parent, false)
        return ModelViewHolder(v)
    }

    override fun onBindViewHolder(holder: Recycler_Inc.ModelViewHolder, position: Int) {

        holder.ItemImage.setOnClickListener({
            Toast.makeText(context,"Delete Icon", Toast.LENGTH_LONG).show()
        })
        holder.ItemImage2.setOnClickListener({
            Toast.makeText(context,"Edit Icon", Toast.LENGTH_LONG).show()
        })
        holder.ItemImage3.setOnClickListener({
            Toast.makeText(context,"Receipt Image", Toast.LENGTH_LONG).show()
        })


        holder.ItemNameInc.setText(itemList[position].name_inc)
        holder.ItemDateInc.setText(itemList[position].date)
        holder.ItemAmountInc.setText(itemList[position].amount.toString())
        holder.ItemImage.setImageResource(itemList[position].image)

    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    inner class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var ConstraintLayt: ConstraintLayout
        var ItemImage: ImageView
        var ItemImage2: ImageView
        var ItemImage3: ImageView

        var ItemNameInc: TextView
        var ItemDateInc: TextView
        var ItemAmountInc: TextView
        var ItemReceipt: TextView


        init {
            ConstraintLayt = itemView.findViewById(R.id.reLayoutInc) as ConstraintLayout
            ItemImage = itemView.findViewById(R.id.deleteRCINC) as ImageView
            ItemImage2 = itemView.findViewById(R.id.editRCINC) as ImageView
            ItemImage3 = itemView.findViewById(R.id.imageRCINC) as ImageView

            ItemNameInc = itemView.findViewById(R.id.nameRCINC) as TextView
            ItemDateInc = itemView.findViewById(R.id.dateRCINC) as TextView
            ItemAmountInc = itemView.findViewById(R.id.totalAmountRCINC) as TextView
            ItemReceipt = itemView.findViewById(R.id.receiptRCINC) as TextView

        }

    }

}