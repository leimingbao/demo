package com.example.myapplication.statuspattern.pattern

class PowerOffState : TvState {
    override fun nextChannel() {
//        println("power off 下一频道")
    }

    override fun prevChannel() {
//        println("power off 上一频道")
    }

    override fun turnUp() {
//        println("power off 音量调高")
    }

    override fun turnDown() {
//        println("power off 音量调低")
    }
}