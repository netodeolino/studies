package com.learning.studies.adapter.`in`.web

import com.learning.studies.application.patterns.decorator.FacebookDecorator
import com.learning.studies.application.patterns.decorator.NotifierImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/decorator")
class DecoratorPatternController {

    @GetMapping
    fun decorator() {
        val notifier = FacebookDecorator(NotifierImpl("Kotlin"))
        notifier.send("Hello World!")
    }

}