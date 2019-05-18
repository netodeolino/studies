package com.learning.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import org.springframework.jms.core.JmsTemplate

@RestController
@RequestMapping("/jms")
class JmsController {

    @Autowired
    lateinit var jmsTemplate: JmsTemplate

    @GetMapping("/{message}")
    fun send(@PathVariable("message") message: String) {
        jmsTemplate.convertAndSend("TransactionQueue", message)
    }
}