package com.learning.studies.application.patterns.abstractfactory

class FordFactory: FactoryOfCars {

    override fun createPopularCar(): PopularCar {
        return Fiesta()
    }

    override fun createSedanCar(): SedanCar {
        return Focus()
    }
}