package com.learning.studies.adapter.`in`.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/about")
class AboutController {

    @GetMapping
    fun about(): String {
        return "Learn project for studies and practice"
    }
}