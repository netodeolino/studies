package com.learning.studies.application.patterns.factory

class SaltyFood : Food {
    var qtdSal: Int = 0

    constructor() : super()

    constructor(nome: String) : super(nome)
}