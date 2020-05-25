package com.example.myapplication.proxypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityProxyLoginBinding
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import javax.inject.Inject

/**
 * 代理模式
 * 当无法或不想直接访问莫哥对象或访问某个对象存在困难当时候可以通过一个代理对象来间接访问，
 * 为了保证客户端使用当透明性，委托对象与代理对象需要实现相同的接口
 */
class ProxyLoginActivity : AppCompatActivity() {

    // lateinit 延迟初始化变量
    @Inject
    lateinit var proxyLoginViewModel: ProxyLoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        val dataBinding: ActivityProxyLoginBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_proxy_login)
        dataBinding.viewModel = proxyLoginViewModel
    }
}
