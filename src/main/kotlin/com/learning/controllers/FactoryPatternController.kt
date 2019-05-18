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

    @GetMapping("/{tipoComida}")
    fun factory(@PathVariable("tipoComida") tipoComida: String): Comida {
        var tipoEnumComida: TipoComida = TipoComida.valueOf(tipoComida)

        var fabrica: FabricaComida = FabricaComida()
        var comida: Comida = fabrica.criaComida(tipoEnumComida)

        return comida
    }
}