package de.mibexx.hex.arch.kotlin.shared.userdata.data

data class UserData(
    var id: Int? = null,
    var email: String? = null,
    var password: String? = null,
    var firstname: String? = null,
    var lastname: String? = null
)