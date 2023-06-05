package com.learning.studies.application.patterns.prototype

open class FiestaPrototype : CarPrototype {

    protected constructor(fiestaPrototype : FiestaPrototype) {
        this.purchaseValue = fiestaPrototype.purchaseValue
    }

    constructor() {
        this.purchaseValue = 0.0
    }

    override fun showInfo(): String {
        return "Fiesta, valor: " + this.purchaseValue
    }

    override fun clone(): CarPrototype {
        return FiestaPrototype(this)
    }
}