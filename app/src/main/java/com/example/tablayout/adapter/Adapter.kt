package com.example.tablayout.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tablayout.R
import com.example.tablayout.databinding.ListItemBinding

class Adapter(
    private val names: List<String>
) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            ListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = with(holder.binding) {
        ivProfile.setImageResource(R.drawable.tiger)
        tvName.text = names[position]
    }

    override fun getItemCount(): Int = names.size
}