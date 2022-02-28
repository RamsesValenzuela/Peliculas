package valenzuela.ramses.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        llenar_peliculas()

        var adaptador = AdaptadorPelicula(this, peliculas)
         var listView : ListView = findViewById(R.id.listView)

        listView.adapter = adaptador

    }

    fun llenar_peliculas(){
        val pelicula1 = pelicula(1,getString(R.string.peli1),getString(R.string.peli1_sinop), 120, R.drawable.batman)
        peliculas.add(pelicula1)
        val pelicula2 = pelicula(2,getString(R.string.peli2),getString(R.string.peli2_sinop), 120, R.drawable.sonic_2)
        peliculas.add(pelicula2)
        val pelicula3 = pelicula(2,getString(R.string.peli3),getString(R.string.peli3_sinop), 120, R.drawable.uncharted)
        peliculas.add(pelicula3)
        val pelicula4 = pelicula(2,getString(R.string.peli4),getString(R.string.peli4_sinop), 120, R.drawable.spider_man)
        peliculas.add(pelicula4)
        val pelicula5 = pelicula(2,getString(R.string.peli5),getString(R.string.peli5_sinop), 120, R.drawable.doctor_strange)
        peliculas.add(pelicula5)
    }
}