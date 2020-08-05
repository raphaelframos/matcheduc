package powellapps.matcheduc.ui.students

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import powellapps.matcheduc.model.Student
import powellapps.matcheduc.service.StudentService
import powellapps.matcheduc.service.StudentServiceImpl

class StudentsViewModel(val service : StudentServiceImpl) : ViewModel() {

    private val students = MutableLiveData<List<Student>>()

    fun getStudents(): MutableLiveData<List<Student>> {
        students.value = service.lista()
        return students
    }
}