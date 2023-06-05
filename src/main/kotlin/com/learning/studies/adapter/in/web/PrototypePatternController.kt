package com.learning.studies.adapter.`in`.web

import com.learning.studies.application.patterns.prototype.CarPrototype
import com.learning.studies.application.patterns.prototype.FiestaPrototype
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/prototype")
class PrototypePatternController {

    @GetMapping
    fun prototype(): CarPrototype {
        val prototipo: FiestaPrototype = FiestaPrototype()

        val palioNovo = prototipo.clone()
        palioNovo.purchaseValue = 27900.0

        val palioUsado = prototipo.clone()
        palioUsado.purchaseValue = 21000.0

        println(palioNovo.showInfo())
        println(palioUsado.showInfo())

        return palioNovo
    }
}