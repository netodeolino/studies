package com.learning.controllers

import com.learning.patterns.builder.CarroProduct
import com.learning.patterns.builder.ConcessionariaDirector
import com.learning.patterns.builder.VolksBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/builder")
class BuilderPatternController {

    @GetMapping
    fun builder(): CarroProduct {
        var concessionaria: ConcessionariaDirector = ConcessionariaDirector(VolksBuilder())

        concessionaria.construirCarro()

        var carro: CarroProduct = concessionaria.getCarroProduct()

        carro.toString()

        return carro
    }
}