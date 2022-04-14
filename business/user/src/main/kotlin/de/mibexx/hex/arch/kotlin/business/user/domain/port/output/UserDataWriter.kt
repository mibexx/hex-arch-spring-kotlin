package de.mibexx.hex.arch.kotlin.business.user.domain.port.output

import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData

interface UserDataWriter {
    fun createUser(userData: UserData): UserData
}