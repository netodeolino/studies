package com.learning.jms

import org.springframework.jms.annotation.JmsListener
import org.springframework.stereotype.Component

@Component
class Receiver {

    @JmsListener(destination = "TransactionQueue", containerFactory = "myFactory")
    fun receiveMessage(message: String) {
        System.out.println("Received <" + message + ">")
    }
}