package com.learning.studies.application.patterns.abstractfactory

interface FactoryOfCars {
    fun createSedanCar(): SedanCar
    fun createPopularCar(): PopularCar
}