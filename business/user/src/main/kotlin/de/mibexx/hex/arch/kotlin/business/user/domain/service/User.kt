package de.mibexx.hex.arch.kotlin.business.user.domain.service

import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData

interface User {
    fun createUser(userData: UserData): UserData
    fun updateUser(userData: UserData)
    fun deleteUser(email: String)
}