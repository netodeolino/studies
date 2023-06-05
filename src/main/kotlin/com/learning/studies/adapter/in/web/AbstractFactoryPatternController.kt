package com.learning.studies.adapter.`in`.web

import com.learning.studies.application.patterns.abstractfactory.PopularCar
import com.learning.studies.application.patterns.abstractfactory.SedanCar
import com.learning.studies.application.patterns.abstractfactory.FordFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/abstract-factory")
class AbstractFactoryPatternController {

    @GetMapping
    fun abstractFactory(): String {
        val fordFactory: FordFactory = FordFactory()

        val popularCar: PopularCar = fordFactory.createPopularCar()
        popularCar.info()

        val sedanCar: SedanCar = fordFactory.createSedanCar()
        sedanCar.info()

        return "abstract factory"
    }
}