package com.example.myapplication.observerpattern

import javax.inject.Inject

class ObserverViewModel @Inject constructor() {

    //被观察者角色
    val devTechFrontier: DevTechFrontier = DevTechFrontier()

    /**
     * 每次调用会再次添加观察者，所以会重复
     */
    fun print() {
        val coder1: Coder = Coder("coder-1")
        val coder2: Coder = Coder("coder-2")
        val coder3: Coder = Coder("coder-3")

        devTechFrontier.addObserver(coder1)
        devTechFrontier.addObserver(coder2)
        devTechFrontier.addObserver(coder3)

        devTechFrontier.postNewPublication("新的一期技术发布啦")
    }
}