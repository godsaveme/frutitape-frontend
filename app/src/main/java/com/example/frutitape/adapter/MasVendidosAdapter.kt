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

class MasVendidosAdapter(val datos:List<MasVendidos>): RecyclerView.Adapter<MasVendidosAdapter.ViewHolder>() {



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val tvwPrecio: TextView = itemView.findViewById(R.id.tvwPrecio)
        val tvwNombre: TextView = itemView.findViewById(R.id.tvwNombre)
        val tvwUnidad: TextView = itemView.findViewById(R.id.tvwUnidad)
        val img: ImageView = itemView.findViewById(R.id.img)

        fun Bind(masVendidos: MasVendidos){
            tvwPrecio.text = masVendidos.precio
            tvwNombre.text = masVendidos.nombre
            tvwUnidad.text = masVendidos.unidad

            //Glide.with(itemView).load("http://goo.gl/gEgYUd").into(img);
            img.setImageResource(masVendidos.imageUrl)
            img.setOnClickListener(View.OnClickListener {
                Toast.makeText(itemView.context,"Hola Mundo", Toast.LENGTH_LONG).show()
            })
        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.mas_vendidos_items,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Bind(datos[position])
    }

    override fun getItemCount()=datos.size
}