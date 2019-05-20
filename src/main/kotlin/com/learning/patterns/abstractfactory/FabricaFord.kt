package com.learning.patterns.abstractfactory

class FabricaFord: FabricaDeCarro {

    override fun criarCarroPopular(): CarroPopular {
        return Fiesta()
    }

    override fun criarCarroSedan(): CarroSedan {
        return Focus()
    }
}