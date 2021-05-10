package powellapps.matcheduc.ui.cardstack

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.yuyakaido.android.cardstackview.*
import org.koin.android.ext.android.bind
import powellapps.matcheduc.databinding.FragmentTinderBinding
import powellapps.matcheduc.repository.ThemeRepository

/**
 * A simple [Fragment] subclass.
 */
class TinderFragment : Fragment(), CardStackListener {

    val manager by lazy { CardStackLayoutManager(context, this) }
    val adapter by lazy { CardStackThemeAdapter(ThemeRepository.createExams()) }
    lateinit var binding : FragmentTinderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTinderBinding.inflate(inflater, container, false)
        initializeLayoutManager()
        binding.cardStackTheme.layoutManager = manager
        binding.cardStackTheme.adapter = adapter
        binding.floatingActionButtonRewind.setOnClickListener {

            binding.cardStackTheme.rewind()

        }

        binding.floatingActionButtonYes.setOnClickListener {
            val setting = SwipeAnimationSetting.Builder()
                .setDirection(Direction.Right)
                .setDuration(Duration.Normal.duration)
                .setInterpolator(AccelerateInterpolator())
                .build()
            manager.setSwipeAnimationSetting(setting)
            binding.cardStackTheme.swipe()
        }

        binding.floatingActionButtonNo.setOnClickListener {
            val setting = SwipeAnimationSetting.Builder()
                .setDirection(Direction.Left)
                .setDuration(Duration.Normal.duration)
                .setInterpolator(AccelerateInterpolator())
                .build()
            manager.setSwipeAnimationSetting(setting)
            binding.cardStackTheme.swipe()
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = "Avaliações"
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

    fun chossen(){
       // val theme = binding.cardStackTheme.adapter.
    }

    fun rejected(){
        // val theme = binding.cardStackTheme.adapter.
    }

    override fun onCardSwiped(direction: Direction?) {
        direction?.let {
            if(it.ordinal == 1){
                chossen()
            }else{
                rejected()
            }

        }
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
