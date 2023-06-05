package com.learning.studies.application.patterns.builder

abstract class CarBuilder {
    protected var carro: CarProduct = CarProduct()

    abstract fun buildPrice()

    abstract fun buildDscMotor()

    abstract fun buildYearOfFactory()

    abstract fun buildModel()

    abstract fun buildMounter()

    fun getCarProduct(): CarProduct {
        return carro
    }
}