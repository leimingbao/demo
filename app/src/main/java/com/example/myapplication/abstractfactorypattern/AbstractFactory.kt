package com.example.myapplication.abstractfactorypattern

abstract class AbstractFactory {
    abstract fun createProductA(): AbstractProductA
    abstract fun createProductB(): AbstractProductB
}