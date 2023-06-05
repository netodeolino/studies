package com.learning.studies.application.patterns.decorator

class FacebookDecorator(private val notifier: Notifier) : BaseNotifierDecorator(notifier) {

    override fun send(message: String) {
        super.send(message)
        println("Sending Facebook message: $message")
    }

}