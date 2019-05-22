package com.learning.patterns.factory

import com.learning.enums.TipoComida

object FabricaComida : FabricaTipoComida {

    var totalComidaDoce: Int = 0
    var totalComidaSalgada: Int = 0

    override fun criaComida(tipoComida: TipoComida): Comida {
        when(tipoComida) {
            TipoComida.DOCE -> {
                totalComidaDoce++
                return ComidaDoce("comida doce")
            }
            TipoComida.SALGADA -> {
                totalComidaSalgada++
                return ComidaSalgada("comida salgada")
            }
        }

    }

    fun singletonInfo() {
        System.out.println("[Comida doce: " + totalComidaDoce + "; Comida salgada: " + totalComidaSalgada + "; Total: " + (totalComidaDoce + totalComidaSalgada) + "]")
    }
}