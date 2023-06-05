package com.learning.studies.application.patterns.strategy

class EmailNotification : NotificationStrategy {
    override fun send(message: String) {
        println("Sending Email notification with message: $message")
    }
}