package de.mibexx.hex.arch.kotlin.api.userrest.configuration

import de.mibexx.hex.arch.kotlin.business.user.UserFacade
import de.mibexx.hex.arch.kotlin.business.user.UserFacadeImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class UserRestFactory {
    @Bean
    open fun userFacade() : UserFacade {
        return UserFacadeImpl()
    }
}