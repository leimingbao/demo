package com.example.myapplication.proxypattern

/**
 * 抽象主题类
 * 该类的主要职责是声明真实主题与代理的共同接口方法，该类即可以是一个抽象类也可以是一个接口
 */
abstract class AbsLogin {
    abstract fun login()
}