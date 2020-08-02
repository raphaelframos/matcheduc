package powellapps.matcheduc.ui.cardstack

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.yuyakaido.android.cardstackview.*
import powellapps.matcheduc.databinding.FragmentTinderBinding
import powellapps.matcheduc.repository.ThemeRepository

/**
 * A simple [Fragment] subclass.
 */
class TinderFragment : Fragment(), CardStackListener {

    val manager by lazy { CardStackLayoutManager(context, this) }
    val adapter by lazy { CardStackThemeAdapter(ThemeRepository.create()) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentTinderBinding.inflate(inflater, container, false)
        initializeLayoutManager()
        binding.cardStackTheme.layoutManager = manager
        binding.cardStackTheme.adapter = CardStackThemeAdapter(ThemeRepository.create())
        binding.floatingActionButtonRewind.setOnClickListener {

            binding.cardStackTheme.rewind()

        }

        return binding.root
    }



    private fun initializeLayoutManager() {
        manager.setVisibleCount(1)
        manager.setStackFrom(StackFrom.None)
        manager.setSwipeableMethod(SwipeableMethod.AutomaticAndManual)
        manager.setDirections(Direction.HORIZONTAL)
    }

    override fun onCardDisappeared(view: View?, position: Int) {
        Log.d("CardStackView", "onCardCanceled: ${manager.topPosition}")
    }

    override fun onCardDragging(direction: Direction?, ratio: Float) {
        Log.d("CardStackView", "onCardCanceled: ")

    }

    override fun onCardSwiped(direction: Direction?) {
        direction?.let {
            if(it.ordinal == 1){

            }
        }

        Toast.makeText(context, "Teste " + direction!!.ordinal + "posicao ${manager.topPosition}", Toast.LENGTH_LONG).show()
    }

    override fun onCardCanceled() {
        Log.d("CardStackView", "onCardCanceled: ${manager.topPosition}")
    }

    override fun onCardAppeared(view: View?, position: Int) {
        Log.d("CardStackView", "onCardCanceled: ${manager.topPosition}")
    }

    override fun onCardRewound() {
        Log.d("CardStackView", "onCardCanceled: ${manager.topPosition}")
    }


}
