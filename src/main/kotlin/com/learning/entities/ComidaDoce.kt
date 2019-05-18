package com.learning.entities

class ComidaDoce : Comida {
    var qtdAcucar: Int = 0

    constructor() : super()

    constructor(nome: String) : super(nome)
}