package com.learning.patterns.factory

open class Comida {
    lateinit var nome: String

    constructor() {}

    constructor(nome: String) {
        this.nome = nome
    }

    override fun toString(): String {
        return "Comida(nome='$nome')"
    }
}