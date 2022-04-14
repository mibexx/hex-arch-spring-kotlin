package de.mibexx.hex.arch.kotlin.business.user

import de.mibexx.hex.arch.kotlin.business.user.domain.service.User
import de.mibexx.hex.arch.kotlin.business.user.domain.service.UserReader
import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData
import org.springframework.beans.factory.annotation.Autowired

class UserFacadeImpl: UserFacade {
    @Autowired
    private lateinit var userService : User

    @Autowired
    private lateinit var userReaderService : UserReader

    override fun createUser(userData: UserData): UserData {
        return userService.createUser(userData)
    }

    override fun updateUser(userData: UserData) {
        userService.updateUser(userData)
    }

    override fun deleteUser(email: String) {
        userService.deleteUser(email)
    }

    override fun getUserByEmail(email: String): UserData {
        return userReaderService.getUserByEmail(email)
    }
}