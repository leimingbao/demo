package com.example.myapplication.stragetypattern

import javax.inject.Inject

class TrafficCalculator @Inject constructor() {
    private var calculatorStrategy: CalculatorStrategy? = null

    fun setStrategy(strategy: CalculatorStrategy?) {
        calculatorStrategy = strategy
    }

    fun calculatePrice(km: Int): Int {
        return calculatorStrategy!!.calculatePrice(km)
    }
}