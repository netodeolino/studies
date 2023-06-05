package com.learning.studies.application.patterns.decorator

class WhatsAppDecorator(private val notifier: Notifier) : BaseNotifierDecorator(notifier) {

    override fun send(message: String) {
        super.send(message)
        println("Sending WhatsApp message: $message")
    }

}