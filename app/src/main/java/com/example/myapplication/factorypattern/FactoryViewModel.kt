package com.example.myapplication.factorypattern

import com.example.myapplication.factorypattern.pattern.ConcreteFactory
import com.example.myapplication.factorypattern.pattern.Factory
import com.example.myapplication.factorypattern.pattern.Product
import javax.inject.Inject

class FactoryViewModel @Inject constructor() {

    fun printResult(a:String) {
        val factory: Factory =
            ConcreteFactory()
        var product: Product = factory.createProduct()
        product.method()
    }


}