package powellapps.matcheduc.ui.students

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import org.koin.android.viewmodel.ext.android.viewModel
import powellapps.matcheduc.databinding.ActivityStudentsBinding

class StudentsActivity : AppCompatActivity() {

    val studentViewModel: StudentsViewModel by viewModel()

    lateinit var binding : ActivityStudentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentsBinding.inflate(LayoutInflater.from(this))
        binding.recyclerStudents.layoutManager = LinearLayoutManager(this)
        binding.recyclerStudents.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        studentViewModel.getStudents().observe(this, androidx.lifecycle.Observer {
            binding.recyclerStudents.adapter = StudentsAdapter(it)
        })

        setContentView(binding.root)
    }
}