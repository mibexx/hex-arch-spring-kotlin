package de.mibexx.hex.arch.kotlin.business.user.domain.port.output

import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData

interface UserDataReader {
    fun getUserByEmail(email: String): UserData
}