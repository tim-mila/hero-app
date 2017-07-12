package com.tim.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso

@SpringBootApplication
@EnableOAuth2Sso
open class HeroAppApplication {

}

fun main(args: Array<String>) {
    SpringApplication.run(HeroAppApplication::class.java, *args);
}
