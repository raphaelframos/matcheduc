package powellapps.matcheduc.model

data class Unit(val name : String, val classroom: String, val amountStudents : Int) {

    override fun toString(): String {
        return name
    }
}