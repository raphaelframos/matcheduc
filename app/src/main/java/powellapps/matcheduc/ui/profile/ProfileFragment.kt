package powellapps.matcheduc.ui.profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import coil.api.load
import coil.transform.CircleCropTransformation
import kotlinx.android.synthetic.main.fragment_profile.*
import powellapps.matcheduc.NewThemeActivity
import powellapps.matcheduc.NewUnitActivity
import powellapps.matcheduc.R
import powellapps.matcheduc.databinding.FragmentProfileBinding
import powellapps.matcheduc.model.Unit
import powellapps.matcheduc.utils.ImageUtils

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentProfileBinding.inflate(inflater, container, false)
        ImageUtils.showImageCircle(binding.imageView, "https://imagens.brasil.elpais.com/resizer/y5S0I2pUA_jXOFgLtLmudfLybbY=/1500x0/arc-anglerfish-eu-central-1-prod-prisa.s3.amazonaws.com/public/WTH33T43JQ4HCKAS6BHGGBYREQ.jpg")
        
        binding.textViewName.setText("Girafales")
        binding.textViewSchool.setText("Instituto Federal Fluminense")
        var u1 = Unit("Língua Portuguesa", "Turma A", 10)
        var u2 = Unit("Redação", "Turma A", 20)
        var u3 = Unit("Literatura", "Turma B", 10)
        var units = arrayListOf<Unit>()
        units.add(u1)
        units.add(u2)
        units.add(u3)
        var adapter = context?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, units) }
        binding.listViewUnits.adapter = adapter
        binding.listViewUnits.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(context, NewThemeActivity::class.java)
            startActivity(intent)
        }
        binding.floatingActionButtonNew.setOnClickListener {
            startActivity(Intent(activity, NewUnitActivity::class.java))
        }
        return binding.root
    }

}
