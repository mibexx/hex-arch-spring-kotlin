package de.mibexx.hex.arch.kotlin.business.user.communication.adapter

import de.mibexx.hex.arch.kotlin.business.user.domain.port.output.UserDataWriter
import de.mibexx.hex.arch.kotlin.business.user.persistence.UserRepository
import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData

class MockUserWriter(val userRepository: UserRepository): UserDataWriter {
    override fun createUser(userData: UserData): UserData {
        return userRepository.createUser(userData)
    }
}