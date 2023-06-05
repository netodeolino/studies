package com.learning.studies.application.patterns.decorator

class NotifierImpl(private val userName: String) : Notifier {

    override fun send(message: String) {
        println("Sending to user: $userName message: $message")
    }

}