package com.example.myapplication.factorypattern

class ConcreteFactory :Factory(){
    override fun createProduct(): Product {
        return ConcreteProductA()
    }

}