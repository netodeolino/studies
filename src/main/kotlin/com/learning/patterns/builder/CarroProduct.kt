package com.learning.patterns.builder

class CarroProduct {
    var preco: Double = 0.0
    var anoFabricacao: Int = 0
    lateinit var dscMotor: String
    lateinit var modelo: String
    lateinit var montadora: String

    override fun toString(): String {
        return "CarroProduct(preco=$preco, anoFabricacao=$anoFabricacao, dscMotor='$dscMotor', modelo='$modelo', montadora='$montadora')"
    }
}