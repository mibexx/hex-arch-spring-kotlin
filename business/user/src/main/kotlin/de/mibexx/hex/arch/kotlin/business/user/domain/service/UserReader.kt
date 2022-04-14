package de.mibexx.hex.arch.kotlin.business.user.domain.service

import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData

interface UserReader {
    fun getUserByEmail(email: String): UserData
}