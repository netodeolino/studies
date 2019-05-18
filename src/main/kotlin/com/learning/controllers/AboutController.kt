package com.learning.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/about")
class AboutController {

    @GetMapping
    fun about() =
            "Learn project for studies and practice"
}