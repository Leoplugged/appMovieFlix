package br.com.zup.movieflix.register.view


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import br.com.zup.movieflix.databinding.ActivityRegisterBinding
import br.com.zup.movieflix.register.model.User

import br.com.zup.movieflix.register.viewmodel.RegisterViewModel


class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private val RegisterViewModel: RegisterViewModel by lazy {
        ViewModelProvider(this)[RegisterViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bvLogin.setOnClickListener {
            val user = binding.etUserNameRegister.text.toString()
            val password =  binding.etPasswordRegister.text.toString()
            val passwordConfirmation =  binding.etConfirmPasswordRegister.text.toString()
            val email = binding.etEmailRegister.text.toString()
            var registry = User(user,password, email)


            //TODO lógica de checagem de password
            //TODO lógica de validação de dados digitados
            //TODO lógica de verificação da não repetição de users
            //TODO lógica de salvar dados
            //TODO lógica nuláveis
        }
    }
}