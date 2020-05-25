package com.example.myapplication.abstractfactorypattern

import com.example.myapplication.factorypattern.ConcreteProductA

class ConcreteFactory1 : AbstractFactory() {
    override fun createProductA(): AbstractProductA {
        return ConcreteProductA1()
    }

    override fun createProductB(): AbstractProductB {
        return ConcreteProductB1()
    }
}