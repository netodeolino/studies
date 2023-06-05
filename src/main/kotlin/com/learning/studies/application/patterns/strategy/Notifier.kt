package com.learning.studies.application.patterns.strategy

class Notifier(private val notificationStrategy: NotificationStrategy) {

    fun notify(message: String) {
        notificationStrategy.send(message)
    }

}