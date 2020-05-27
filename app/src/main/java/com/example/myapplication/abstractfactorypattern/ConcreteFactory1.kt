package com.example.myapplication.abstractfactorypattern

class ConcreteFactory1 : AbstractFactory() {
    override fun createProductA(): AbstractProductA {
        return ConcreteProductA1()
    }

    override fun createProductB(): AbstractProductB {
        return ConcreteProductB1()
    }
}