package br.com.gattodev.appstudies.model

import java.util.UUID

data class User(
    val id: UUID,
    val email: String,
    val password: String,
    var role: Role
)

enum class Role {
    USER, ADMIN
}