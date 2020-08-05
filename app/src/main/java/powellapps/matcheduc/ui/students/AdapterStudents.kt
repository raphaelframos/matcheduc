package powellapps.matcheduc.ui.students

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import powellapps.matcheduc.databinding.AdapterStudentsBinding
import powellapps.matcheduc.model.Student

class AdapterStudents(val students : List<Student>) : RecyclerView.Adapter<AdapterStudents.StudentsViewHolder>() {

    class StudentsViewHolder(val binding : AdapterStudentsBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(student: Student) {
            binding.textViewName.text = student.name
            binding.textViewThemes.text = student.themes
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentsViewHolder {
        val binding = AdapterStudentsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StudentsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return students.size
    }

    override fun onBindViewHolder(holder: StudentsViewHolder, position: Int) {
        holder.bind(students[position])
    }
}