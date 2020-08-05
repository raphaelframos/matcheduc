package powellapps.matcheduc.service

import powellapps.matcheduc.model.Student
import powellapps.matcheduc.repository.StudentRepository

class StudentServiceImpl(val repository: StudentRepository) : StudentService{

    override fun lista(): List<Student> {
        return repository.lista()
    }
}