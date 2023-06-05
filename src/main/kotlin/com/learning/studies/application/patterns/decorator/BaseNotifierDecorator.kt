package com.learning.studies.application.patterns.decorator

abstract class BaseNotifierDecorator(private val notifier: Notifier) : Notifier {

    override fun send(message: String) {
        notifier.send(message)
    }

}