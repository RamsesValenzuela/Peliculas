package valenzuela.ramses.peliculas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.security.AccessControlContext

class AdaptadorPelicula: BaseAdapter{

    lateinit var context: Context
    var peliculas: ArrayList<pelicula> = ArrayList()

    constructor(context: Context, peliculas: ArrayList<pelicula> ){
        this.context = context
        this.peliculas = peliculas
    }

    override fun getCount(): Int {
        //Indica el numero de objetos en la lista
        return peliculas.size
    }

    override fun getItem(p0: Int): Any {
        //Indica el elemento individual con el cual puedo interactuar
        return peliculas[p0]
    }

    override fun getItemId(p0: Int): Long {
      //pide el id del elemnto que estamos trabajando
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //obtener un inflador
        val inflador = LayoutInflater.from(context)
        var vista = inflador.inflate(R.layout.peliculas_view,null)
        var iv_img: ImageView = vista.findViewById(R.id.img_view)
        var tv_nombre: TextView = vista.findViewById(R.id.tv_nombre)

        var pelicula: pelicula = peliculas[p0]

        iv_img.setImageResource(pelicula.img)
        tv_nombre.setText(pelicula.nombre)

        return vista


    }


}