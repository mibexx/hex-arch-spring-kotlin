package de.mibexx.hex.arch.kotlin.business.user.communication.adapter

import de.mibexx.hex.arch.kotlin.business.user.domain.port.output.UserDataReader
import de.mibexx.hex.arch.kotlin.business.user.persistence.UserRepository
import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData

class MockUserReader(val userRepository: UserRepository): UserDataReader {
    override fun getUserByEmail(email: String): UserData {
        return userRepository.getUserByEmail(email)
    }
}