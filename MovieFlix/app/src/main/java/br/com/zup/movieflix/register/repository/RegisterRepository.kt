package br.com.zup.movieflix.register.repository

import br.com.zup.movieflix.register.model.User

class RegisterRepository {
    fun getListUser(): List<User> {
        val listUser = mutableListOf<User>()

        listUser.add(User("Admin", "Admin","leandro.miguel@zup.com.br", accessAuth = true))

        return listUser
    }
}