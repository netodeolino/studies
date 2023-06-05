package com.learning.studies.application.patterns.factory

class SweetFood : Food {
    var qtdAcucar: Int = 0

    constructor() : super()

    constructor(nome: String) : super(nome)
}