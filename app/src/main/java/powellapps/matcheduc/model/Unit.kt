package powellapps.matcheduc.model

data class Unit(val name : String, val classroom: String, val amountStudents : Int, val teacherPhoto : String) {

    override fun toString(): String {
        return name
    }
}