package com.learning.controllers

import com.learning.patterns.abstractfactory.CarroPopular
import com.learning.patterns.abstractfactory.CarroSedan
import com.learning.patterns.abstractfactory.FabricaFord
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/abstract-factory")
class AbstractFactoryPatternController {

    @GetMapping
    fun abstractFactory(): String {
        var fabricaFord: FabricaFord = FabricaFord()

        var carroPopular: CarroPopular = fabricaFord.criarCarroPopular()
        carroPopular.info()

        var carroSedan: CarroSedan = fabricaFord.criarCarroSedan()
        carroSedan.info()

        return "abstract factory"
    }
}