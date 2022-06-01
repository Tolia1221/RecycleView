package com.example.plantshandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plantshandbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding//подключаем ViewBinding
    private val adapter=PlantAdapter()
    private val imageidListt  = listOf (R.drawable.grogi,R.drawable.grogi,R.drawable.grogi)
    private var index=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)//надуваем наш холдер
        setContentView(binding.root)
        init()
    }
    private fun init(){
        binding.apply {
            rcView.layoutManager=GridLayoutManager(this@MainActivity,3)
            rcView.adapter=adapter

            if(index>4) index=0
            val plant=Plant(imageidListt[index],"$index")
            index++


            adapter.addPlant(plant)
        }//пишем apply для того чтобы мы могли получить доступ напрямую к элементам
    }
}