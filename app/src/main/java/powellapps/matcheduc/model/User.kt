package powellapps.matcheduc.model

data class User(val name: String, val email: String, val isTeacher : Boolean) {

    constructor() : this("","",false)

}