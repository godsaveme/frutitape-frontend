package com.example.frutitape.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.frutitape.R
import com.example.frutitape.model.Productores
import com.example.frutitape.model.Productos

class ProductosAdapter(val datos:List<Productos>): RecyclerView.Adapter<ProductosAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvwProductName: TextView = itemView.findViewById(R.id.tvwProductName)
        val tvwProductPrice: TextView = itemView.findViewById(R.id.tvwProductPrice)
        val tvwProductProductor: TextView = itemView.findViewById(R.id.tvwProductProductor)
        val tvwProductUnity: TextView = itemView.findViewById(R.id.tvwProductUnity)
        val tvwProductStart: TextView = itemView.findViewById(R.id.tvwProductStart)

        val img: ImageView = itemView.findViewById(R.id.imgProductImage)

        fun Bind(producto: Productos) {
            tvwProductName.text=producto.nombre
            tvwProductPrice.text=producto.precio
            tvwProductProductor.text=producto.productor
            tvwProductUnity.text=producto.unidad
            tvwProductStart.text=producto.puntuacion
            //Glide.with(itemView).load("http://goo.gl/gEgYUd").into(img);

            img.setImageResource(producto.imageUrl)
            img.setOnClickListener(View.OnClickListener {
                Toast.makeText(itemView.context,"Hola Mundo", Toast.LENGTH_LONG).show()
            })
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.productos_items, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Bind(datos[position])
    }

    override fun getItemCount() = datos.size
}