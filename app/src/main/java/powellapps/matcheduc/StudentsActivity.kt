package powellapps.matcheduc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import powellapps.matcheduc.databinding.ActivityStudentsBinding
import powellapps.matcheduc.model.Student
import powellapps.matcheduc.ui.students.StudentsAdapter
import java.util.*

class StudentsActivity : AppCompatActivity() {

    lateinit var binding : ActivityStudentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentsBinding.inflate(LayoutInflater.from(this))
        binding.recyclerStudents.layoutManager = LinearLayoutManager(this)
        binding.recyclerStudents.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        binding.recyclerStudents.adapter = StudentsAdapter(Arrays.asList(
            Student("Raphael", "https://avatars0.githubusercontent.com/u/896599?s=460&u=43f8a00b191124d9c91b0822a28e3e5179e0bc0f&v=4", "Teste, teste, teste"),
            Student("Raphael", "https://avatars0.githubusercontent.com/u/896599?s=460&u=43f8a00b191124d9c91b0822a28e3e5179e0bc0f&v=4", "Teste, teste, teste"),
            Student("Raphael", "https://avatars0.githubusercontent.com/u/896599?s=460&u=43f8a00b191124d9c91b0822a28e3e5179e0bc0f&v=4", "Teste, teste, teste"),
            Student("Raphael", "https://avatars0.githubusercontent.com/u/896599?s=460&u=43f8a00b191124d9c91b0822a28e3e5179e0bc0f&v=4", "Teste, teste, teste"),
            Student("Raphael", "https://avatars0.githubusercontent.com/u/896599?s=460&u=43f8a00b191124d9c91b0822a28e3e5179e0bc0f&v=4", "Teste, teste, teste"),
            Student("Raphael", "https://avatars0.githubusercontent.com/u/896599?s=460&u=43f8a00b191124d9c91b0822a28e3e5179e0bc0f&v=4", "Teste, teste, teste")
        ))
        setContentView(binding.root)
    }
}