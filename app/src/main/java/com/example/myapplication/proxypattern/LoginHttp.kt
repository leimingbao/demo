package com.example.myapplication.proxypattern

import javax.inject.Inject

/**
 * 真实主题类
 * 该类也被称作为被委托类或者被代理类，该类定义了代理所表示的真实对象，由其执行具体的业务逻辑方法，
 * 而客户类则通过代理类间接地调用真实主题类中定义的方法
 */
class LoginHttp @Inject constructor() : AbsLogin() {
    override fun login() {
        println("do login action")
    }

    /**
     * 代理类
     * 该类持有一个对正式主题类对引用，在其所实现对接口方法中调用真实主题类中相应对接口方法执行,以起到代理的作用
     */
    class ProxyLogin @Inject constructor(private val loginHttp: LoginHttp) : AbsLogin() {
        override fun login() {
            loginHttp.login()
        }
    }
}

