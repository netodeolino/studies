package com.learning.patterns.factory

import com.learning.enums.TipoComida

interface FabricaTipoComida {

    fun criaComida(tipoComida: TipoComida): Comida
}