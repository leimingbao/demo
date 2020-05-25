package com.example.myapplication.factorypattern

import javax.inject.Inject

class FactoryViewModel @Inject constructor() {

    fun printResult() {
        val factory: Factory = ConcreteFactory()
        var product: Product = factory.createProduct()
        product.method()
    }
}