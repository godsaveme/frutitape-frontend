package com.example.frutitape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.frutitape.adapter.MasVendidosAdapter
import com.example.frutitape.adapter.ProductoresAdapter
import com.example.frutitape.adapter.ProductosAdapter
import com.example.frutitape.model.MasVendidos
import com.example.frutitape.model.Productores
import com.example.frutitape.model.Productos
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

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
            Productores("Don Pepe",R.drawable.ic_person1),
            Productores("Luchita",R.drawable.ic_person6),
            Productores("La fresca",R.drawable.ic_person4),
            Productores("El barato",R.drawable.ic_person5),
            Productores("MaxFruts",R.drawable.ic_person2),
            Productores("El Point",R.drawable.ic_person3)
        )
        val myAdapterProductores:ProductoresAdapter=ProductoresAdapter(listaProductores)

        recyclerProductores.apply {
            adapter=myAdapterProductores
            layoutManager= LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL,false)
        }

        /*val api:APIService = getRetrofit().create(APIService::class.java)

        api.getProducer().enqueue(object: Callback<List<Productores>> {
            override fun onFailure(call: Call<List<Productores>>, t: Throwable) {
                Toast.makeText(this@MainActivity,"Error", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<List<Productores>>, response: Response<Productores>) {
                Enlazar(response.body)
            }
        })*/

        val recyclerProductos: RecyclerView = findViewById(R.id.recycler_productos)

        val listaProductos:List<Productos> = listOf(
            Productos("Sandia","S/ 17.00",R.drawable.card1,"Kg","Don Pepe","3.9"),
            Productos("Fresa","S/ 15.00",R.drawable.card3,"Caja","La Fresca","3.6"),
            Productos("Kiwi","S/ 8.00",R.drawable.card2,"Jaba","Lucia Shop","4.2"),
            Productos("Papaya","S/ 6.90",R.drawable.card4,"Canasta","4 Felices","3.0"),
            Productos("Maracuya","S/ 5.40",R.drawable.card3,"Kg","Don Luchito","2.5"),
            Productos("Manzana","S/ 7.50",R.drawable.card1,"Kg","El Chunga","5.0"),
            Productos("Platano","S/ 2.80",R.drawable.card2,"Kg","La Master","4.7")
        )
        val myAdapterProductos:ProductosAdapter=ProductosAdapter(listaProductos)

        recyclerProductos.apply {
            adapter=myAdapterProductos
            layoutManager= LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL,false)
        }
    }

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://52.249.24.233:8085/v0/frutitape/producers")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun Enlazar(datos:List<Productores>){
        val recyclerProductores: RecyclerView = findViewById(R.id.recycler_productores)
        val myAdapterProductores:ProductoresAdapter=ProductoresAdapter(datos)
        recyclerProductores.apply {
            adapter = myAdapterProductores
            layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
        }

    }
}