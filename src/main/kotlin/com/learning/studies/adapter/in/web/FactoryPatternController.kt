package com.learning.studies.adapter.`in`.web

import com.learning.studies.application.domain.enums.FoodType
import com.learning.studies.application.patterns.factory.Food
import com.learning.studies.application.patterns.factory.FoodFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/factory")
class FactoryPatternController {

    @GetMapping
    fun factory(): Food {
        val fabrica: FoodFactory = FoodFactory

        val food1: Food = fabrica.createFood(FoodType.DOCE)
        fabrica.singletonInfo()

        var food2: Food = fabrica.createFood(FoodType.SALGADA)
        fabrica.singletonInfo()

        return food1
    }
}