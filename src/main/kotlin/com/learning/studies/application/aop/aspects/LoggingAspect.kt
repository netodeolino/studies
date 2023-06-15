package com.learning.studies.application.aop.aspects

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingAspect {

    @Pointcut("@annotation(com.learning.studies.application.aop.annotations.Log)")
    fun logPointcut() {}

    @Before("logPointcut()")
    fun logAllMethodCallsAdvice() {
        println("In Aspect!")
    }

}