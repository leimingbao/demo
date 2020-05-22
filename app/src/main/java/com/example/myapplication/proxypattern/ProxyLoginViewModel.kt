package com.example.myapplication.proxypattern

import javax.inject.Inject

/**
 * 客户类，即使用代理类的类型
 */
class ProxyLoginViewModel @Inject constructor(private val proxyLogin: LoginHttp.ProxyLogin) {

    fun proxyLoginClick() {
        proxyLogin.login()
    }
}