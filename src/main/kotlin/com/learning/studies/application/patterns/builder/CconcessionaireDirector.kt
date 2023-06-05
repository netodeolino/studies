package com.learning.studies.application.patterns.builder

open class CconcessionaireDirector(private var mounter: CarBuilder) {

    fun buildCar() {
        mounter.buildPrice()
        mounter.buildYearOfFactory()
        mounter.buildDscMotor()
        mounter.buildModel()
        mounter.buildMounter()
    }

    fun getCarProduct(): CarProduct {
        return mounter.getCarProduct()
    }
}