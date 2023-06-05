package com.learning.studies.application.patterns.command

class EnableSMSFeatureCommand(private val sms: SMS) : ToggleCommand {

    override fun execute() {
        sms.setActive(true)
    }

}