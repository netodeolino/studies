package com.learning.studies.adapter.`in`.web

import com.learning.studies.application.patterns.strategy.Strategy
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/strategy")
class StrategyPatternController {

    @GetMapping
    fun strategy() {
        val notifier = Strategy().createStrategy(1)
        notifier.notify("Hello Kotlin")
    }

}