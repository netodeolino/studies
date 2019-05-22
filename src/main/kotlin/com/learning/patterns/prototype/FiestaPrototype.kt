package com.learning.patterns.prototype

class FiestaPrototype : CarroPrototype {

    protected constructor(fiestaPrototype : FiestaPrototype) {
        this.valorCompra = fiestaPrototype.valorCompra
    }

    constructor() {
        this.valorCompra = 0.0
    }

    override fun exibirInfo(): String {
        return "Fiesta, valor: " + this.valorCompra
    }

    override fun clonar(): CarroPrototype {
        return FiestaPrototype(this)
    }
}