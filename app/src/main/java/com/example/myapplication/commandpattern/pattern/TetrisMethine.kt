package com.example.myapplication.commandpattern.pattern

import javax.inject.Inject

/**
 * 接收者角色
 */
class TetrisMethine {

    @Inject
    constructor()

    /**
     * 真正处理向左的逻辑代码
     */
    fun toLeft(){
        println("向左")
    }

    fun toRight(){
        println("向右")
    }

    fun fastToBottom(){
        println("快速落下")
    }

    fun transform(){
        println("改变形状")
    }
}