package com.learning.studies.application.patterns.strategy

class SMSNotification : NotificationStrategy {
    override fun send(message: String) {
        println("Sending SMS notification with message: $message")
    }
}