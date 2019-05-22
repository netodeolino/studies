package com.learning.patterns.builder

class VolksBuilder : CarroBuilder() {
    override fun buildDscMotor() {
        carro.preco = 27000.00
    }

    override fun buildAnoDeFabricacao() {
        carro.dscMotor = "Voyage/Gol 1.0"
    }

    override fun buildModelo() {
        carro.anoFabricacao = 2011
    }

    override fun buildMontadora() {
        carro.modelo = "Voyage"
    }

    override fun buildPreco() {
        carro.montadora = "Volks"
    }
}