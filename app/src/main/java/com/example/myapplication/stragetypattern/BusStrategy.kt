package com.example.myapplication.stragetypattern

class BusStrategy :CalculatorStrategy {
    override fun calculatePrice(km: Int): Int {
        println("这是 bus 策略")
        return km
    }
}