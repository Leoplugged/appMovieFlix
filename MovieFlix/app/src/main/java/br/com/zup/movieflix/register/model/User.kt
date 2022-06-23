package br.com.zup.movieflix.register.model

data class User (
    var user : String,
    var password : String,
    var email : String,
    var accessAuth : Boolean
)
