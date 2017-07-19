package com.tim.spring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
open class HelloWorldController {

    @GetMapping("/hello")
    public fun hello() : String{
        return "Hello World"
    }
}