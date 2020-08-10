package powellapps.matcheduc.ui.information

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import org.koin.android.ext.android.bind
import powellapps.matcheduc.R
import powellapps.matcheduc.databinding.FragmentInformationBinding
import powellapps.matcheduc.model.Information

class InformationFragment : Fragment() {

    private lateinit var binding: FragmentInformationBinding
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInformationBinding.inflate(inflater, container, false)
        viewPager = binding.pager
        viewPager.adapter = InformationAdapter(this)
        TabLayoutMediator(binding.tabLayoutType, viewPager) { tab, position ->
            var title = ""
            if(position == 0){
                title = getString(R.string.avaliacao)
            }else{
                title = getString(R.string.tema)
            }
            tab.text = title
        }.attach()
        return binding.root
    }

    class InformationAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

        override fun getItemCount(): Int = 2

        override fun createFragment(position: Int): Fragment {
            if (position == 0) {
                return TestInformationFragment()
            }
            return ThemeInformationFragment()
        }
    }


}