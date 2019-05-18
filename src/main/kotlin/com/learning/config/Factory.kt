package com.learning.config

import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jms.config.DefaultJmsListenerContainerFactory
import org.springframework.jms.config.JmsListenerContainerFactory
import javax.jms.ConnectionFactory

@Configuration
class Factory {

    @Bean
    fun myFactory(connectionFactory: ConnectionFactory, configurer: DefaultJmsListenerContainerFactoryConfigurer): JmsListenerContainerFactory<*> {
        var factory = DefaultJmsListenerContainerFactory()
        configurer.configure(factory, connectionFactory)
        return factory
    }
}