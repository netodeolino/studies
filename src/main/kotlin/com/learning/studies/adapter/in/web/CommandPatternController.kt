package com.learning.studies.adapter.`in`.web

import com.learning.studies.application.patterns.command.FeatureToggleConfig
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/command")
class CommandPatternController {

    @GetMapping
    fun command() {
        val featureToggleConfig = FeatureToggleConfig()
        featureToggleConfig.activeEmail()
        featureToggleConfig.activeSMS()
    }

}