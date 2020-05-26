package com.example.myapplication.commandpattern

import com.example.myapplication.commandpattern.pattern.*
import com.example.myapplication.commandpattern.pattern.commands.FallCommand
import com.example.myapplication.commandpattern.pattern.commands.LeftCommand
import com.example.myapplication.commandpattern.pattern.commands.RightCommand
import com.example.myapplication.commandpattern.pattern.commands.TransformCommand
import javax.inject.Inject

/**
 * 客户类
 */
class CommandPatternViewModel @Inject constructor(tetrisMethine: TetrisMethine) {
    private val leftCommand: LeftCommand = LeftCommand(tetrisMethine)
    private val rightCommand: RightCommand = RightCommand(tetrisMethine)
    private val fallCommand: FallCommand = FallCommand(tetrisMethine)
    private val transformCommand: TransformCommand = TransformCommand(tetrisMethine)

    private val buttons: Buttons = Buttons()

    fun myinit() {
        buttons.setLeftCommand(leftCommand)
        buttons.setRightCommand(rightCommand)
        buttons.setFallCommand(fallCommand)
        buttons.setTransformCommand(transformCommand)

        buttons.toLeft()
        buttons.toRight()
        buttons.fall()
        buttons.transform()
    }
}