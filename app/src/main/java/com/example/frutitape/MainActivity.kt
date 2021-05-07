package com.example.frutitape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.frutitape.adapter.MasVendidosAdapter
import com.example.frutitape.adapter.ProductoresAdapter
import com.example.frutitape.model.MasVendidos
import com.example.frutitape.model.Productores

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val recyclerMasVendidos: RecyclerView = findViewById(R.id.recycler_masvendidos)

        val lista:List<MasVendidos> = listOf(
            MasVendidos("Kiwi",R.drawable.card1,"S/ 120.00","Caja"),
            MasVendidos("Fresa",R.drawable.card2,"S/ 5.00","Kg"),
            MasVendidos("Papaya",R.drawable.card3,"S/ 25.00","Caja"),
            MasVendidos("Sandia",R.drawable.card4,"S/ 1.00","Kg")

        )
        val myAdapter:MasVendidosAdapter=MasVendidosAdapter(lista)

        recyclerMasVendidos.apply {
            adapter=myAdapter
            layoutManager= LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL,false)
        }


        val recyclerProductores: RecyclerView = findViewById(R.id.recycler_productores)

        val listaProductores:List<Productores> = listOf(
            Productores("",""),
            Productores("",""),
            Productores("",""),
            Productores("",""),
            Productores("",""),
            Productores("","")
        )
        val myAdapterProductores:ProductoresAdapter=ProductoresAdapter(listaProductores)

        recyclerProductores.apply {
            adapter=myAdapterProductores
            layoutManager= LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL,false)
        }
    }
}