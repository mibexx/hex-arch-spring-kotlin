package de.mibexx.hex.arch.kotlin.business.user.persistence

import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData
import kotlin.random.Random

interface UserRepository {
    fun getUserByEmail(email: String): UserData
    fun createUser(userData: UserData): UserData
}