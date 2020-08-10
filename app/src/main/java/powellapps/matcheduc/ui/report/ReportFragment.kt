package powellapps.matcheduc.ui.report

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import powellapps.matcheduc.R
import powellapps.matcheduc.databinding.FragmentReportBinding
import powellapps.matcheduc.model.Unit
import java.util.*

class ReportFragment : Fragment() {

    lateinit var binding : FragmentReportBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReportBinding.inflate(LayoutInflater.from(context), container, false)
        val photo = "https://scontent.fcaw1-1.fna.fbcdn.net/v/t1.0-9/61465306_2217457061708677_8160794546549030912_n.jpg?_nc_cat=109&_nc_sid=09cbfe&_nc_ohc=b__I665RMD0AX9WK5W8&_nc_ht=scontent.fcaw1-1.fna&oh=269baf3aea56b883bf224bf16bad7ece&oe=5F55252F"

        var u1 = Unit("Língua Portuguesa", "Turma A", 10, photo)
        var u2 = Unit("Redação", "Turma B", 20, photo)
        binding.recyclerReports.layoutManager = LinearLayoutManager(context)
        binding.recyclerReports.adapter = UnitAdapter(Arrays.asList(u1, u2))
        binding.recyclerReports.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        return binding.root
    }

}