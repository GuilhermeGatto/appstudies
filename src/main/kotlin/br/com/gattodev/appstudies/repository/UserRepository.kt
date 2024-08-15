package br.com.gattodev.appstudies.repository

import br.com.gattodev.appstudies.model.Role
import br.com.gattodev.appstudies.model.User
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class UserRepository(
    private val encoder: PasswordEncoder
) {
    private val users = mutableListOf(
        User(id = UUID.randomUUID(), email = "a@a.com", password = encoder.encode("pass1"), role = Role.USER),
        User(id = UUID.randomUUID(), email = "b@b.com", password = encoder.encode("pass2"), role = Role.ADMIN),
        User(id = UUID.randomUUID(), email = "c@c.com", password = encoder.encode("pass3"), role = Role.USER)
    )

    fun save(user: User): Boolean {
        val updated = user.copy(password = encoder.encode(user.password))
        return users.add(updated)
    }

    fun findByEmail(email: String): User? =
        users.firstOrNull { it.email == email }

    fun findAll(): List<User> = users

    fun findByUUID(uuid: UUID): User? =
        users.firstOrNull { it.id == uuid }

    fun deleteByUUID(uuid: UUID): Boolean {
        val foundUser = findByUUID(uuid)

        return foundUser?.let {
            users.remove(it)
        } ?: false
    }

}