package com.learning.controllers

import com.learning.entities.Comida
import com.learning.enums.TipoComida
import com.learning.patterns.factory.FabricaComida
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/factory")
class FactoryPatternController {

    @GetMapping
    fun factory(): Comida {
        var fabrica: FabricaComida = FabricaComida

        var comida1: Comida = fabrica.criaComida(TipoComida.DOCE)
        fabrica.singletonInfo()

        var comida2: Comida = fabrica.criaComida(TipoComida.SALGADA)
        fabrica.singletonInfo()

        return comida1
    }
}