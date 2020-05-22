package com.example.myapplication.proxyPattern

class RealSubject:Subject() {
    override fun visit() {
        println("real subject")
    }
}