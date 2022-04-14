package de.mibexx.hex.arch.kotlin.business.user.domain.service

import de.mibexx.hex.arch.kotlin.business.user.domain.port.output.UserDataReader
import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData

class UserReaderImpl(val userDataReader: UserDataReader): UserReader {
    override fun getUserByEmail(email: String): UserData {
        return userDataReader.getUserByEmail(email)
    }
}