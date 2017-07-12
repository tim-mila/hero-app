package com.tim.spring.controller

import com.tim.spring.entity.User
import com.tim.spring.repository.UserRepository
import mu.KLogging
import org.springframework.security.oauth2.provider.OAuth2Authentication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class UserController(val userRepository: UserRepository){

    companion object: KLogging()

    @GetMapping("/user")
    fun user(principal: Principal) : Principal {

        logger.info { principal }
        if (principal is OAuth2Authentication) {
            logger.info { "Authentication is OAuth2Authentication" }
            logger.info { principal.userAuthentication.details.javaClass }

            val details = principal.userAuthentication.details;
            if (details is Map<*, *>) {
                logger.info { details["id"] }
                val id = details["id"].toString()
                val user = userRepository.findOne(id);

                if (user == null) {
                    logger.info { "user not found create" }

                    val create = User(id)
                    create.email = details["email"].toString()
                    create.name = details["name"].toString()
                    create.link = details["link"].toString()
                    create.picture = details["picture"].toString()
                    create.locale = details["locale"].toString()
                    logger.info { userRepository.save(create).id }
                }
            }
        }
        return principal;
    }

    @GetMapping("/hello")
    fun hello() : String {
        return "Hello"
    }
}