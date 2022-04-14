package de.mibexx.hex.arch.kotlin.business.user.persistence

import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData
import kotlin.random.Random
import kotlin.random.nextInt

class MockUserRepository: UserRepository {
    override fun getUserByEmail(email: String): UserData {
        return UserData(
            id = Random.nextInt(IntRange(0, 999)),
            email = "mock@user.io",
            password = "mock.password",
            firstname = "Mock",
            lastname = "User"
        )
    }

    override fun createUser(userData: UserData): UserData {
        userData.id = Random.nextInt(IntRange(0, 999))
        return userData
    }
}