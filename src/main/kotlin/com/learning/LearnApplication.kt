package com.learning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jms.annotation.EnableJms

@EnableJms
@SpringBootApplication
class LearnApplication

fun main(args: Array<String>) {
	runApplication<LearnApplication>(*args)
}
