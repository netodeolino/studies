package com.learning.patterns.prototype

abstract class CarroPrototype {
    var valorCompra: Double = 0.0

    abstract fun exibirInfo(): String

    abstract fun clonar(): CarroPrototype
}