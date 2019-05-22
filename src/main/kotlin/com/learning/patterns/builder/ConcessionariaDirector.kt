package com.learning.patterns.builder

class ConcessionariaDirector {
    lateinit protected var montadora: CarroBuilder

    constructor(montadora: CarroBuilder) {
        this.montadora = montadora
    }

    fun construirCarro() {
        montadora.buildPreco()
        montadora.buildAnoDeFabricacao()
        montadora.buildDscMotor()
        montadora.buildModelo()
        montadora.buildMontadora()
    }

    fun getCarroProduct(): CarroProduct {
        return montadora.getCarroProduct()
    }
}