package com.example.myapplication

import android.app.Application
import dagger.Component
import dagger.android.AndroidInjector

@Component(modules = [MainModule::class])
interface ApplicationComponent : AndroidInjector<Application> {
    fun inject(application: AppApplication)
}