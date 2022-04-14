package de.mibexx.hex.arch.kotlin.business.user.configuration

import de.mibexx.hex.arch.kotlin.business.user.communication.adapter.MockUserReader
import de.mibexx.hex.arch.kotlin.business.user.communication.adapter.MockUserWriter
import de.mibexx.hex.arch.kotlin.business.user.domain.port.input.PostCreateUser
import de.mibexx.hex.arch.kotlin.business.user.domain.port.output.UserDataReader
import de.mibexx.hex.arch.kotlin.business.user.domain.port.output.UserDataWriter
import de.mibexx.hex.arch.kotlin.business.user.domain.service.User
import de.mibexx.hex.arch.kotlin.business.user.domain.service.UserImpl
import de.mibexx.hex.arch.kotlin.business.user.domain.service.UserReader
import de.mibexx.hex.arch.kotlin.business.user.domain.service.UserReaderImpl
import de.mibexx.hex.arch.kotlin.business.user.persistence.MockUserRepository
import de.mibexx.hex.arch.kotlin.business.user.persistence.UserRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class UserFactory {
    @Bean
    open fun user(): User {
        return UserImpl(
            createUserDataWriter(),
            getPostCreateUserAdapterList()
        )
    }

    @Bean
    open fun userReader(): UserReader {
        return UserReaderImpl(createUserDataReader())
    }

    private fun createUserDataReader(): UserDataReader {
        return MockUserReader(createUserRepository())
    }

    private fun createUserDataWriter(): UserDataWriter {
        return MockUserWriter(createUserRepository())
    }

    private fun createUserRepository(): UserRepository {
        return MockUserRepository()
    }

    private fun getPostCreateUserAdapterList(): List<PostCreateUser> {
        return listOf()
    }
}