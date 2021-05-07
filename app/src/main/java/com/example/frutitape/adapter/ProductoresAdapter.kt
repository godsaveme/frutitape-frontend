package com.example.frutitape.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.frutitape.R
import com.example.frutitape.model.MasVendidos
import com.example.frutitape.model.Productores

class ProductoresAdapter(val datos:List<Productores>): RecyclerView.Adapter<ProductoresAdapter.ViewHolder>() {



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val tvwProductorName: TextView = itemView.findViewById(R.id.tvwProductorName)

        val img: ImageView = itemView.findViewById(R.id.imgProductor)

        fun Bind(productor: Productores){
            tvwProductorName.text = productor.nombre
            //Glide.with(itemView).load("http://goo.gl/gEgYUd").into(img);
            img.setImageResource(productor.imageUrl)
            img.setOnClickListener(View.OnClickListener {
                Toast.makeText(itemView.context,"Hola Mundo", Toast.LENGTH_LONG).show()
            })
        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.productores_items,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Bind(datos[position])
    }

    override fun getItemCount()=datos.size
}