package com.learning.patterns.abstractfactory

interface FabricaDeCarro {
    fun criarCarroSedan(): CarroSedan
    fun criarCarroPopular(): CarroPopular
}