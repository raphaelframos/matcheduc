package powellapps.matcheduc.ui.cardstack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yuyakaido.android.cardstackview.CardStackLayoutManager
import com.yuyakaido.android.cardstackview.Direction
import com.yuyakaido.android.cardstackview.StackFrom
import com.yuyakaido.android.cardstackview.SwipeableMethod

import powellapps.matcheduc.R
import powellapps.matcheduc.databinding.FragmentTinderBinding
import powellapps.matcheduc.repository.ThemeRepository

/**
 * A simple [Fragment] subclass.
 */
class TinderFragment : Fragment() {

    val manager by lazy { CardStackLayoutManager(context) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentTinderBinding.inflate(inflater, container, false)

        initializeLayoutManager()
        binding.cardStackTheme.layoutManager = manager
        binding.cardStackTheme.adapter = CardStackThemeAdapter(ThemeRepository.create())
        return binding.root
    }

    private fun initializeLayoutManager() {
        manager.setVisibleCount(3)
        manager.setStackFrom(StackFrom.None)
        manager.setSwipeableMethod(SwipeableMethod.AutomaticAndManual)
        manager.setDirections(Direction.HORIZONTAL)
    }


}
