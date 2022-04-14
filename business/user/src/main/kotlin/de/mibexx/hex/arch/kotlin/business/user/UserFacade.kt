package de.mibexx.hex.arch.kotlin.business.user

import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData

interface UserFacade {
    fun createUser(userData: UserData): UserData
    fun updateUser(userData: UserData)
    fun deleteUser(email: String)
    fun getUserByEmail(email: String): UserData
}