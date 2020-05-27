package com.example.myapplication.statuspattern.pattern

class TvController :
    PowerController {
    private var tvState: TvState? = null

    override fun powerOn() {
        tvState = PowerOnState()
        println("开机啦")
    }

    override fun powerOff() {
        tvState = PowerOffState()
        println("关机啦")
    }

    fun nextChannel(){
        tvState!!.nextChannel()
    }

    fun prevChannel(){
        tvState!!.prevChannel()
    }

    fun turnUp(){
        tvState!!.turnUp()
    }

    fun turnDown(){
        tvState!!.turnDown()
    }
}