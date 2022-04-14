package de.mibexx.hex.arch.kotlin.business.user.domain.service

import de.mibexx.hex.arch.kotlin.business.user.domain.port.input.PostCreateUser
import de.mibexx.hex.arch.kotlin.business.user.domain.port.output.UserDataWriter
import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData

class UserImpl(val userDataWriter: UserDataWriter, val postCreateUserAdapterList: List<PostCreateUser>): User {
    override fun createUser(userData: UserData): UserData {
        var responseUserData = userDataWriter.createUser(userData)

        postCreateUserAdapterList.forEach {
            responseUserData = it.userCreated(responseUserData)
        }

        return responseUserData
    }

    override fun updateUser(userData: UserData) {
        println("Update user")
        println(userData)
    }

    override fun deleteUser(email: String) {
        println("Delete user ${email}")
    }
}