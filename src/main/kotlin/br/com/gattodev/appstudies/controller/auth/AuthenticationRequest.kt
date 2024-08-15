package br.com.gattodev.appstudies.controller.auth

data class AuthenticationRequest(
    val email: String,
    val password: String
)
