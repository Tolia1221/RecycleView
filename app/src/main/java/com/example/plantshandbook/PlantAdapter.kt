package com.example.plantshandbook

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.plantshandbook.databinding.ImageLayoutBinding


class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PlantHolder> {
    class PlantHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = ImageLayoutBinding.bind(item)
        fun bind(plant:Plant){
            binding.ivGrogi.setImageResource(plant.idImage)



        }

    }
}