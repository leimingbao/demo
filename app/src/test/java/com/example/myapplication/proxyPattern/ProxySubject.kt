package com.example.myapplication.proxyPattern

class ProxySubject constructor(private var mRealSubject: RealSubject) : Subject() {
    override fun visit() {
        mRealSubject.visit()
    }
}