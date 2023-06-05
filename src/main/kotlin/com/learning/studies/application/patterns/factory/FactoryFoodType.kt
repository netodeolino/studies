package com.learning.studies.application.patterns.factory

import com.learning.studies.application.domain.enums.FoodType

interface FactoryFoodType {

    fun createFood(foodType: FoodType): Food
}