package com.example.jokeapp.view

import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.jokeapp.R
import com.example.jokeapp.model.Category
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item

class CategoryItem(private val category: Category): Item<CategoryItem.CategoryViewHolder>() {
    class CategoryViewHolder(view: View): GroupieViewHolder(view)

    override fun createViewHolder(itemView: View) = CategoryViewHolder(itemView)

    override fun bind(viewHolder: CategoryViewHolder, position: Int) {
        viewHolder.itemView.findViewById<TextView>(R.id.text_category).text = category.name
        viewHolder.itemView.findViewById<LinearLayout>(R.id.container_category)
            .setBackgroundColor(category.bgColor.toInt())
    }

    override fun getLayout() = R.layout.item_category
}