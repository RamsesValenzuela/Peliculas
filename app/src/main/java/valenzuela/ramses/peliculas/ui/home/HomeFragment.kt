package valenzuela.ramses.peliculas.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import valenzuela.ramses.peliculas.AdaptadorPelicula
import valenzuela.ramses.peliculas.R
import valenzuela.ramses.peliculas.databinding.FragmentHomeBinding
import valenzuela.ramses.peliculas.pelicula

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    var peliculas: ArrayList<pelicula> = ArrayList()

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val textView: TextView = binding.textHome
      //  homeViewModel.text.observe(viewLifecycleOwner) {
            //    textView.text = it
        //}


        llenar_peliculas()

        var adaptador = AdaptadorPelicula(root.context, peliculas)
        var listView : ListView = binding.listiViewPeliculas

        listView.adapter = adaptador
        return root
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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}