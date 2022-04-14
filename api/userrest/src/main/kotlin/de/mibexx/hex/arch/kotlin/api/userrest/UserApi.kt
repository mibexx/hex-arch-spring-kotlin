package main.kotlin.de.mibexx.hex.arch.kotlin.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["de.mibexx.hex.arch.kotlin"])
open class UserApi

fun main(args: Array<String>) {
    runApplication<UserApi>(*args)
}
