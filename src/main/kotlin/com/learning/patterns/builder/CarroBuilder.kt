package com.learning.patterns.builder

abstract class CarroBuilder {
    protected lateinit var carro: CarroProduct

    constructor() {
        this.carro = CarroProduct()
    }

    abstract fun buildPreco()

    abstract fun buildDscMotor()

    abstract fun buildAnoDeFabricacao()

    abstract fun buildModelo()

    abstract fun buildMontadora()

    fun getCarroProduct(): CarroProduct {
        return carro
    }
}