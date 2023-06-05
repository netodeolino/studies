package com.learning.studies.application.patterns.builder

class VolksBuilder : CarBuilder() {
    override fun buildDscMotor() {
        carro.dscEngine = "Voyage/Gol 1.0"
    }

    override fun buildYearOfFactory() {
        carro.factoryYear = 2011
    }

    override fun buildModel() {
        carro.model = "Voyage"
    }

    override fun buildMounter() {
        carro.mounter = "Volks"
    }

    override fun buildPrice() {
        carro.price = 27000.00
    }
}