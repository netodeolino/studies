package com.learning.studies.application.aop.services

import com.learning.studies.application.aop.annotations.Log
import org.springframework.stereotype.Service

@Service
class AopTestService {

    @Log
    fun doAnything() {
        println("Doing anything within AopTestService!")
    }

}