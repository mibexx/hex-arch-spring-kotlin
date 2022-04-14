package de.mibexx.hex.arch.kotlin.api.userrest.application.controller

import de.mibexx.hex.arch.kotlin.api.rest.application.annotation.ApiController
import de.mibexx.hex.arch.kotlin.business.user.UserFacade
import de.mibexx.hex.arch.kotlin.shared.userdata.data.UserData
import org.springframework.web.bind.annotation.*

@ApiController
@RequestMapping("/user")
class UserController(val userFacade : UserFacade) {

    @PostMapping
    fun createUser(@RequestBody userData : UserData): UserData{
        return userFacade.createUser(userData)
    }

    @PutMapping
    fun updateUser(@RequestBody userData : UserData) {
        userFacade.updateUser(userData)
    }

    @DeleteMapping
    fun updateUser(@RequestParam email : String) {
        userFacade.deleteUser(email)
    }

    @GetMapping
    fun getUser(@RequestParam email : String): UserData {
        return userFacade.getUserByEmail(email)
    }
}