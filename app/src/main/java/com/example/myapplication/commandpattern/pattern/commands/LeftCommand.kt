package com.example.myapplication.commandpattern.pattern.commands

import com.example.myapplication.commandpattern.pattern.TetrisMethine

/**
 * 具体命令者
 */
class LeftCommand constructor(private var tetrisMethine: TetrisMethine) : Command {

    override fun execute() {
        tetrisMethine.toLeft()
    }
}