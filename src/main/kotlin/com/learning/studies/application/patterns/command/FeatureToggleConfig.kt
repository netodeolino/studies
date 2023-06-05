package com.learning.studies.application.patterns.command

class FeatureToggleConfig() {

    private val sms: SMS = SMS()
    private val email: Email = Email()

    fun activeSMS() {
        val smsToggleCommand: ToggleCommand = EnableSMSFeatureCommand(sms)
        smsToggleCommand.execute()
    }

    fun activeEmail() {
        val emailToggleCommand: ToggleCommand = EnableEmailFeatureCommand(email)
        emailToggleCommand.execute()
    }

}