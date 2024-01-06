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
import com.example.budget_buddy_app.category.Model_Category

class Recycler_View_Adapter(final var context: Context, val itemList: ArrayList<Model_Category>) :
    RecyclerView.Adapter<Recycler_View_Adapter.ModelViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Recycler_View_Adapter.ModelViewHolder {

        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_rc, parent, false)
        return ModelViewHolder(v)
    }

    override fun onBindViewHolder(holder: Recycler_View_Adapter.ModelViewHolder, position: Int) {

        holder.ItemImage.setOnClickListener({
            Toast.makeText(context,"Delete Icon", Toast.LENGTH_LONG).show()
        })

        holder.ItemName.setText(itemList[position].name)
        holder.ItemCause.setText(itemList[position].cause)
        holder.ItemTotal.setText(itemList[position].totalAmount.toString())
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    inner class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var ConstraintLayt: ConstraintLayout
        var ItemImage: ImageView
        var ItemName: TextView
        var ItemCause: TextView
        var ItemTotal: TextView

        init {
            ConstraintLayt = itemView.findViewById(R.id.reLayout) as ConstraintLayout
            ItemImage = itemView.findViewById(R.id.deleteRC) as ImageView
            ItemName = itemView.findViewById(R.id.nameRC) as TextView
            ItemCause = itemView.findViewById(R.id.causeRC) as TextView
            ItemTotal = itemView.findViewById(R.id.totalAmountRC) as TextView
        }

    }

}