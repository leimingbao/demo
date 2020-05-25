package com.example.myapplication.stragetypattern

import javax.inject.Inject

class StrategyViewModel @Inject constructor(private val trafficCalculator: TrafficCalculator) {

    fun calculatePrice() {
        trafficCalculator.setStrategy(SubwayStrategy())
        println("price = " + trafficCalculator.calculatePrice(50))
    }
}