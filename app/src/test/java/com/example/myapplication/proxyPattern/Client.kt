package com.example.myapplication.proxyPattern

import org.junit.Test

class Client {
    /**
     * 代理模式
     * 当无法或不想直接访问莫哥对象或访问某个对象存在困难当时候可以通过一个代理对象来间接访问，
     * 为了保证客户端使用当透明性，委托对象与代理对象需要实现相同的接口
     */
    @Test
    fun proxyPattern() {
        var realSubject = RealSubject()
        var proxySubject = ProxySubject(realSubject)
        proxySubject.visit()
    }
}

