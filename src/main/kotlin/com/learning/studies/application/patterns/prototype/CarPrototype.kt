package com.learning.studies.application.patterns.prototype

abstract class CarPrototype {
    var purchaseValue: Double = 0.0

    abstract fun showInfo(): String

    abstract fun clone(): CarPrototype
}