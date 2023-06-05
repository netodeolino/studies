package com.learning.studies.application.patterns.command

class EnableEmailFeatureCommand(private val email: Email) : ToggleCommand {

    override fun execute() {
        email.setActive(true)
    }

}