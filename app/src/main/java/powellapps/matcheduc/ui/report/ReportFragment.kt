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
        var u1 = Unit("Língua Portuguesa", "Turma A", 10)
        var u2 = Unit("Redação", "Turma B", 20)
        binding.recyclerReports.layoutManager = LinearLayoutManager(context)
        binding.recyclerReports.adapter = UnitAdapter(Arrays.asList(u1, u2))
        binding.recyclerReports.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        return binding.root
    }

}