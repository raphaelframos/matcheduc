package powellapps.matcheduc.service

import powellapps.matcheduc.model.User

class LoginService {

    companion object{

        fun isUser(email: String, password: String) : User {
            if(email.equals("carla@gmail.com") && password.equals("123")){
                return User("Carla Gonçalves", "carla@gmail.com", true)
            }
            return User()
        }

    }
}