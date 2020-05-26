package com.example.myapplication.statuspattern

class StatePatternViewModel {
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