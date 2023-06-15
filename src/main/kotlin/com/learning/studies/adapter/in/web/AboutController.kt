package com.learning.studies.adapter.`in`.web

import com.learning.studies.application.aop.services.AopTestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/about")
class AboutController(private val aopTestService: AopTestService) {

    @GetMapping
    fun about(): String {
        aopTestService.doAnything()
        return "Project for studies and practice"
    }

}