package com.example.myapplication.factorypattern.pattern

class ConcreteFactory : Factory(){
    override fun createProduct(): Product {
        return ConcreteProductA()
    }

}