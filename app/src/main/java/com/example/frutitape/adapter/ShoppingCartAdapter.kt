package com.example.frutitape.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.frutitape.R
import com.example.frutitape.model.ShoppingCart

class ShoppingCartAdapter(val datos:List<ShoppingCart>): RecyclerView.Adapter<ShoppingCartAdapter.ViewHolder>() {



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val price: TextView = itemView.findViewById(R.id.price)
        val nameProduct: TextView = itemView.findViewById(R.id.nameProduct)
        val nameUnity: TextView = itemView.findViewById(R.id.nameUnity)
        val imgProduct: ImageView = itemView.findViewById(R.id.imgProduct)
        val quantity: TextView = itemView.findViewById(R.id.quantity)

        fun Bind(shoppingCart: ShoppingCart){
            price.text = shoppingCart.precio
            nameProduct.text = shoppingCart.producto
            nameUnity.text = shoppingCart.unidad
            quantity.text = shoppingCart.cantidad

            //Glide.with(itemView).load("http://goo.gl/gEgYUd").into(img);
            imgProduct.setImageResource(shoppingCart.imageUrl)
            imgProduct.setOnClickListener(View.OnClickListener {
                Toast.makeText(itemView.context,"Hola Mundo", Toast.LENGTH_LONG).show()
            })
        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.shopping_cart_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Bind(datos[position])
    }

    override fun getItemCount()=datos.size
}