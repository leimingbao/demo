package com.example.myapplication.stragetypattern

class SubwayStrategy : CalculatorStrategy {
    override fun calculatePrice(km: Int): Int {
        println("这是 subway 策略")
        return km
    }
}