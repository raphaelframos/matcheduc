package powellapps.matcheduc.model

data class Theme(val name: String, val descriptions : List<String>) {

    var assessments = arrayListOf<Assessment>()

}