package de.mibexx.hex.arch.kotlin.business.user.domain.port.input

import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData

interface PostCreateUser {
    fun userCreated(userData: UserData): UserData
}