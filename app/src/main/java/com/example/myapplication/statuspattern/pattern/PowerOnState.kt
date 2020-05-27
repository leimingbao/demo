package com.example.myapplication.statuspattern.pattern

class PowerOnState : TvState {
    override fun nextChannel() {
        println("power on 上一频道")
    }

    override fun prevChannel() {
        println("power on 下一频道")
    }

    override fun turnUp() {
        println("power on 调高音量")
    }

    override fun turnDown() {
        println("power on 调低音量")
    }
}