package com.example.frutitape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.frutitape.adapter.ShoppingCartAdapter
import com.example.frutitape.model.ShoppingCart

class ShoppingCart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoppingcart)

        supportActionBar?.hide()

        val rvwShoppingCart: RecyclerView = findViewById(R.id.rvwShoppingCart)

        val lista:List<ShoppingCart> = listOf(
            ShoppingCart("Melón Coquito", R.drawable.card1, "S/ 11.50", "Und.", "3"),
            ShoppingCart("Fresa", R.drawable.card2, "S/ 14.30", "Kg.", "2"),
            ShoppingCart("Papaya", R.drawable.card3, "S/ 17.00", "Und.", "5"),
            ShoppingCart("Sandía", R.drawable.card4, "S/ 8.50", "Kg.", "4")



        )
        val myAdapter: ShoppingCartAdapter = ShoppingCartAdapter(lista)

        rvwShoppingCart.apply {
            adapter=myAdapter
            layoutManager= LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL,false)
        }

    }
}