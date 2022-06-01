package com.example.plantshandbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plantshandbook.databinding.ImageLayoutBinding


class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PlantHolder>() {
    val plantList=ArrayList<Plant>()
    class PlantHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = ImageLayoutBinding.bind(item)//  создали переменную которая,наследуется от класса созданного на основе нашего шаблона  Image grogu
        fun bind(plant:Plant)=with(binding){//приравниваем к байдингу,чтобы каждый раз не вызывать его могло быть
            // binding.ivGrogi.setImageResource(plant.idImage),станет   ivGrogi.setImageResource(plant.idImage)
          ivGrogi.setImageResource(plant.idImage)
tvImage.text=plant.title


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {//этот метод берет нашу разметку Image_layout
    // надувает ее и заносит в наш класс PlantHolder
        val view=LayoutInflater.from(parent.context).inflate(R.layout.image_layout,parent,false)
        return PlantHolder(view)//эта фун-я ждет пока мы передадим ей ViewHolder,передаем ему шаблон для заполнения
        //Этот класс хранит ссылки на наши элементы View  будет 50 эелеменитов будет 50 ViewHolder

    }

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {//здесь мы начинаем заполнять наш View,который находится в памяти наши TextView,ImageView
//сюда передается наш класс PlantHolder,чтобы мы из него взяли элементы для заполнения    ivGrogi.setImageResource(plant.idImage)
//tvImage.text=plant.title
        holder.bind(plantList[position])


    }

    override fun getItemCount(): Int {//передаем размер нашего массива
return plantList.size
    }
    fun addPlant(plant:Plant){
        plantList.add(plant)
        notifyDataSetChanged()
    }
}
