package com.learning.studies.application.patterns.factory

open class Food {
    lateinit var nome: String

    constructor() {}

    constructor(nome: String) {
        this.nome = nome
    }

    override fun toString(): String {
        return "Comida(nome='$nome')"
    }
}