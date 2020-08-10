package powellapps.matcheduc.repository

import powellapps.matcheduc.model.Student
import java.util.*

class StudentRepository {

    fun lista() : List<Student> {
        return Arrays.asList(
            Student("Raphael Ramos", "https://avatars0.githubusercontent.com/u/896599?s=460&u=43f8a00b191124d9c91b0822a28e3e5179e0bc0f&v=4", "O Bullying nas redes sociais, Impunidade")
        )
    }
}