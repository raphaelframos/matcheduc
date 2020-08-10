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
import powellapps.matcheduc.model.Teacher
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

        val user = Teacher()
        user.name = "Carla Gonçalves"
        user.school = "Instituto Federal Fluminense"
        user.photo = "https://scontent.fcaw1-1.fna.fbcdn.net/v/t1.0-9/61465306_2217457061708677_8160794546549030912_n.jpg?_nc_cat=109&_nc_sid=09cbfe&_nc_ohc=b__I665RMD0AX9WK5W8&_nc_ht=scontent.fcaw1-1.fna&oh=269baf3aea56b883bf224bf16bad7ece&oe=5F55252F"
        binding.textViewName.setText(user.name)
        binding.textViewSchool.text = user.school
        ImageUtils.showImageCircle(binding.imageView,
            user.photo)
        
        var u1 = Unit("Língua Portuguesa", "Turma A", 10)
        var u2 = Unit("Redação", "Turma A", 20)
        var u3 = Unit("Literatura", "Turma B", 10)
        var units = arrayListOf<Unit>()

        units.add(u1)
        units.add(u2)
        units.add(u3)
        user.units = units
        var adapter = context?.let { ArrayAdapter(it, android.R.layout.simple_list_item_1, user.units) }
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
