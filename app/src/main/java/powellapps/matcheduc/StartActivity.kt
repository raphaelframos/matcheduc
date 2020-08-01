package powellapps.matcheduc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import powellapps.matcheduc.databinding.ActivityStartBinding
import powellapps.matcheduc.model.User
import powellapps.matcheduc.service.LoginService
import java.util.zip.Inflater

class StartActivity : AppCompatActivity() {

    private lateinit var binding : ActivityStartBinding
    private lateinit var user : User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.buttonSignIn.setOnClickListener {
            val email = binding.editTextEmailAddress.text.toString()
            val password = binding.editTextPassword.text.toString()
            val type = binding.switchTeacher.isChecked

            if(isValid(email, password)){
                finish()
            }else{
                startActivity(Intent(applicationContext, NewUserActivity::class.java))
            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.start_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    fun isValid(email: String, password : String) : Boolean{
        if(email.isNullOrEmpty()){
            binding.editTextEmailAddress.error = getString(R.string.campo_branco)
            return false
        }

        if(password.isNullOrEmpty()){
            binding.editTextPassword.error = getString(R.string.campo_branco)
            return false
        }

        user = LoginService.isUser(email, password)
        if(user.name.isNullOrEmpty()){
            return false
        }
        return true
    }
}