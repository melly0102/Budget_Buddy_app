package com.example.budget_buddy_app

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.budget_buddy_app.category.DetailedCategoryActivity
import com.example.budget_buddy_app.category.EditCategoryActivity
import com.example.budget_buddy_app.category.Model_Category

class Recycler_View_Adapter(final var context: Context, val itemList: ArrayList<Model_Category>) :
    RecyclerView.Adapter<Recycler_View_Adapter.ModelViewHolder>() {
    private lateinit var mListener: onItemClickListenerInterface
    interface onItemClickListenerInterface{
        fun onItemClickListener(position:Int)
    }

    fun setOnItemClickListener(listener: onItemClickListenerInterface){
        mListener = listener


    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Recycler_View_Adapter.ModelViewHolder {

        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_rc, parent, false)
        return ModelViewHolder(v,mListener)
    }

    override fun onBindViewHolder(holder: Recycler_View_Adapter.ModelViewHolder, position: Int) {

        holder.ItemImage.setOnClickListener({

            itemList.removeAt(position)
            this.notifyDataSetChanged()
            Toast.makeText(context,"Delete Icon", Toast.LENGTH_LONG).show()
        })
        holder.ItemImage2.setOnClickListener({
            val intent = Intent(context, EditCategoryActivity::class.java)
            context.startActivity(intent)
            Toast.makeText(context,"Edit Icon", Toast.LENGTH_LONG).show()
        })

        holder.ItemImage3.setOnClickListener({
            val intent = Intent(context, DetailedCategoryActivity::class.java)
            context.startActivity(intent)
            Toast.makeText(context,"Forward Icon", Toast.LENGTH_LONG).show()
        })


        holder.ItemName.setText(itemList[position].name)
        holder.ItemCause.setText(itemList[position].cause)
        holder.ItemTotal.setText(itemList[position].totalAmount.toString())
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    inner class ModelViewHolder(itemView: View, listener: onItemClickListenerInterface) : RecyclerView.ViewHolder(itemView) {

        var ConstraintLayt: ConstraintLayout
        var ItemImage: ImageView
        var ItemImage2: ImageView
        var ItemImage3: ImageView
        var ItemName: TextView
        var ItemCause: TextView
        var ItemTotal: TextView

        init {
            itemView.setOnClickListener {
                listener.onItemClickListener(adapterPosition)
            }
            ConstraintLayt = itemView.findViewById(R.id.reLayout) as ConstraintLayout
            ItemImage = itemView.findViewById(R.id.deleteRC) as ImageView
            ItemImage2 = itemView.findViewById(R.id.editRC) as ImageView
            ItemImage3 = itemView.findViewById(R.id.arrowRC) as ImageView

            ItemName = itemView.findViewById(R.id.nameRC) as TextView
            ItemCause = itemView.findViewById(R.id.causeRC) as TextView
            ItemTotal = itemView.findViewById(R.id.totalAmountRC) as TextView

        }

    }

}