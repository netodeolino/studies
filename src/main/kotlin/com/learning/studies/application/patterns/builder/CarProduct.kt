package com.learning.studies.application.patterns.builder

class CarProduct {
    var price: Double = 0.0
    var factoryYear: Int = 0
    lateinit var dscEngine: String
    lateinit var model: String
    lateinit var mounter: String

    override fun toString(): String {
        return "CarProduct(price=$price, factoryYear=$factoryYear, dscEngine='$dscEngine', model='$model', mounter='$mounter')"
    }
}