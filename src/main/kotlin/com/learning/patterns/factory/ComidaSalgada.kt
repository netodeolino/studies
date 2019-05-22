package com.learning.patterns.factory

class ComidaSalgada : Comida {
    var qtdSal: Int = 0

    constructor() : super()

    constructor(nome: String) : super(nome)
}