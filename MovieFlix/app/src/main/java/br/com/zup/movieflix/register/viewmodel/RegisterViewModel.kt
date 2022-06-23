package br.com.zup.movieflix.register.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.movieflix.register.model.User
import br.com.zup.movieflix.register.repository.RegisterRepository

class RegisterViewModel : ViewModel(){
    private val repository = RegisterRepository()
    private var _response: MutableLiveData<User> = MutableLiveData()
    val response: LiveData<User> = _response
}