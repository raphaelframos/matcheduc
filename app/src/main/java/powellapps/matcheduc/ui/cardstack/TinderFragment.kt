package powellapps.matcheduc.ui.cardstack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yuyakaido.android.cardstackview.CardStackLayoutManager

import powellapps.matcheduc.R
import powellapps.matcheduc.databinding.FragmentTinderBinding
import powellapps.matcheduc.repository.ThemeRepository

/**
 * A simple [Fragment] subclass.
 */
class TinderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentTinderBinding.inflate(inflater, container, false)
        binding.cardStackTheme.layoutManager = CardStackLayoutManager(context)
        binding.cardStackTheme.adapter = CardStackThemeAdapter(ThemeRepository.create())
        return binding.root
    }


}
