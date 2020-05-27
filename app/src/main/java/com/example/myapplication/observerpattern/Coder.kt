package com.example.myapplication.observerpattern

import java.util.*

/**
 * 观察者
 */
class Coder constructor(private var name: String) : Observer {
    override fun update(o: Observable?, arg: Any?) {
        println("更新啦" + name + "内容" + arg)
    }

    override fun toString(): String {
        return "码农: " + name
    }
}