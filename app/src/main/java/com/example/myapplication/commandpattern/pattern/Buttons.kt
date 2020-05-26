package com.example.myapplication.commandpattern.pattern

import com.example.myapplication.commandpattern.pattern.commands.FallCommand
import com.example.myapplication.commandpattern.pattern.commands.LeftCommand
import com.example.myapplication.commandpattern.pattern.commands.RightCommand
import com.example.myapplication.commandpattern.pattern.commands.TransformCommand

/**
 * 请求者类
 */
class Buttons {
    private var leftCommand: LeftCommand? = null
    private var rightCommand: RightCommand? = null
    private var fallCommand: FallCommand? = null
    private var transformCommand: TransformCommand? = null

    fun setLeftCommand(leftCommand: LeftCommand){
        this.leftCommand = leftCommand
    }

    fun setRightCommand(rightCommand: RightCommand){
        this.rightCommand = rightCommand
    }

    fun setFallCommand(fallCommand: FallCommand){
        this.fallCommand = fallCommand
    }

    fun setTransformCommand(transformCommand: TransformCommand){
        this.transformCommand = transformCommand
    }

    fun toLeft(){
        leftCommand!!.execute()
    }

    fun toRight(){
        rightCommand!!.execute()
    }

    fun fall(){
        fallCommand!!.execute()
    }

    fun transform(){
        transformCommand!!.execute()
    }
}