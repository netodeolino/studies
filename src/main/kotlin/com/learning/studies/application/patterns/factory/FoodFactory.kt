package com.learning.studies.application.patterns.factory

import com.learning.studies.application.domain.enums.FoodType

object FoodFactory : FactoryFoodType {

    var totalSweetFood: Int = 0
    var totalSaltyFood: Int = 0

    override fun createFood(foodType: FoodType): Food {
        when(foodType) {
            FoodType.DOCE -> {
                totalSweetFood++
                return SweetFood("comida doce")
            }
            FoodType.SALGADA -> {
                totalSaltyFood++
                return SaltyFood("comida salgada")
            }
        }
    }

    fun singletonInfo() {
        System.out.println("[Comida doce: " + totalSweetFood + "; Comida salgada: " + totalSaltyFood + "; Total: " + (totalSweetFood + totalSaltyFood) + "]")
    }
}