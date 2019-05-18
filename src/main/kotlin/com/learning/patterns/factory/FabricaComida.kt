package com.learning.patterns.factory

import com.learning.entities.Comida
import com.learning.entities.ComidaDoce
import com.learning.entities.ComidaSalgada
import com.learning.enums.TipoComida

class FabricaComida : FabricaTipoComida {

    override fun criaComida(tipoComida: TipoComida): Comida {
        when(tipoComida) {
            TipoComida.DOCE -> return ComidaDoce("comida doce")
            TipoComida.SALGADA -> return ComidaSalgada("comida salgada")
        }

    }
}