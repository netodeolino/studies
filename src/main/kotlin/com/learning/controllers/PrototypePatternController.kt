package com.learning.controllers

import com.learning.patterns.prototype.CarroPrototype
import com.learning.patterns.prototype.FiestaPrototype
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/prototype")
class PrototypePatternController {

    @GetMapping
    fun prototype(): CarroPrototype {
        var prototipo: FiestaPrototype = FiestaPrototype()

        val palioNovo = prototipo.clonar()
        palioNovo.valorCompra = 27900.0

        val palioUsado = prototipo.clonar()
        palioUsado.valorCompra = 21000.0

        println(palioNovo.exibirInfo())
        println(palioUsado.exibirInfo())

        return palioNovo
    }
}