package powellapps.matcheduc.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import coil.api.load
import coil.transform.CircleCropTransformation
import powellapps.matcheduc.R
import powellapps.matcheduc.databinding.FragmentProfileBinding
import powellapps.matcheduc.model.Unit

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentProfileBinding.inflate(inflater, container, false)
        binding.imageView.load("https://imagens.brasil.elpais.com/resizer/y5S0I2pUA_jXOFgLtLmudfLybbY=/1500x0/arc-anglerfish-eu-central-1-prod-prisa.s3.amazonaws.com/public/WTH33T43JQ4HCKAS6BHGGBYREQ.jpg") {
            crossfade(true)
            placeholder(R.drawable.ic_home_black_24dp)
            transformations(CircleCropTransformation())
        }
        binding.textViewName.setText("Girafales")
        binding.textViewSchool.setText("Instituto Federal Fluminense")
        var u1 = Unit("Portugues")
        var u2 = Unit("Redação")
        var u3 = Unit("Literatura")
        var units = arrayListOf<Unit>()
        units.add(u1)
        units.add(u2)
        units.add(u3)
        var adapter = context?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, units) }
        binding.listViewUnits.adapter = adapter
        return binding.root
    }

}
