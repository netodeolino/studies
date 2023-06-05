package com.learning.studies.adapter.`in`.web

import com.learning.studies.application.patterns.builder.CarProduct
import com.learning.studies.application.patterns.builder.CconcessionaireDirector
import com.learning.studies.application.patterns.builder.VolksBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/builder")
class BuilderPatternController {

    @GetMapping
    fun builder(): CarProduct {
        val concessionaria: CconcessionaireDirector = CconcessionaireDirector(VolksBuilder())

        concessionaria.buildCar()

        val carro: CarProduct = concessionaria.getCarProduct()

        carro.toString()

        return carro
    }
}