package com.example.myapplication.abstractfactorypattern

class ConcreteFactory2: AbstractFactory() {
    override fun createProductA(): AbstractProductA {
        return ConcreteProductA2()
    }

    override fun createProductB(): AbstractProductB {
        return ConcreteProductB2()
    }
}