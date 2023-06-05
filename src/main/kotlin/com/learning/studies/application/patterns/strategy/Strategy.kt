package com.learning.studies.application.patterns.strategy

class Strategy {

    fun createStrategy(choice: Int): Notifier {
        return if (choice == 1) {
            Notifier(EmailNotification())
        } else {
            Notifier(SMSNotification())
        }
    }

}