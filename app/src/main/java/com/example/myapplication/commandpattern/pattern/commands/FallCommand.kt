package com.example.myapplication.commandpattern.pattern.commands

import com.example.myapplication.commandpattern.pattern.TetrisMethine

/**
 * 具体命令者
 */
class FallCommand constructor(tetrisMethine: TetrisMethine): Command {
    private var tetrisMethine: TetrisMethine? = null

    init {
        this.tetrisMethine =tetrisMethine
    }

    override fun execute() {
        tetrisMethine!!.fastToBottom()
    }
}