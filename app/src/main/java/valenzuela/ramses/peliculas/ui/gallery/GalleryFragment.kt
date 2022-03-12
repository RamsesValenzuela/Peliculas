package valenzuela.ramses.peliculas.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import valenzuela.ramses.peliculas.AdaptadorPelicula
import valenzuela.ramses.peliculas.AdaptadorSeries
import valenzuela.ramses.peliculas.R
import valenzuela.ramses.peliculas.databinding.FragmentGalleryBinding
import valenzuela.ramses.peliculas.series

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    var series: ArrayList<series> = ArrayList()
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

       // val textView: TextView = binding.textGallery
     //   galleryViewModel.text.observe(viewLifecycleOwner) {
       //     textView.text = it
        //}


        llenarSeries()
        var adaptador = AdaptadorSeries(root.context, series)
        var listView : ListView = binding.listiViewSeries
        listView.adapter = adaptador

        return root
    }

    fun llenarSeries(){
    val serie1 = series(1,getString(R.string.serie1),getString(R.string.serie_sinop1),R.drawable.the_mandalorian)
        series.add(serie1)
        val serie2 = series(2,getString(R.string.serie2),getString(R.string.serie_sinop2),R.drawable.cobra_kai)
        series.add(serie2)
        val serie3 = series(3,getString(R.string.serie3),getString(R.string.serie_sinop3),R.drawable.the_boys)
        series.add(serie3)
        val serie4 = series(4,getString(R.string.serie4),getString(R.string.serie_sinop4),R.drawable.the_witcher)
        series.add(serie4)
        val serie5 = series(5,getString(R.string.serie5),getString(R.string.serie_sinop5),R.drawable.invencible)
        series.add(serie5)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}