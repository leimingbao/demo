package com.example.myapplication.statuspattern

class StatePatternViewModel {
    /**
     * 状态模式中的行为是由状态决定的，不同的状态下有不同的行为。状态模式和策略模式的结构击鼓完全一样，
     * 但是他们的目的，本质却完全不一样，
     * 状态模式的行为是平行的，不可替换的，
     * 策略模式的行为是彼此独立，可相互替换的。
     * 用一句话表述，状态模式把对象的行为包装在不同的状态对象里，每一个状态对象都有一个共同的抽象状态基类。
     * 状态模式的意图是让一个对象在其内部状态改变的时候，行为也随之改变
     */
    private val tvController: TvController = TvController()

    fun statePrint(){
        tvController.powerOn()
        tvController.nextChannel()
        tvController.turnUp()
        tvController.powerOff()
        //会无效 因为是空实现
        tvController.turnUp()
    }
}