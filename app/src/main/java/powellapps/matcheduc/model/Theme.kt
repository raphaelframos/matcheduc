package powellapps.matcheduc.model

data class Theme(val name: String, val description : String) {

    var assessments = arrayListOf<Assessment>()

}