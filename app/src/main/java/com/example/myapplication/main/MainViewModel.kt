package com.example.myapplication.main

import androidx.databinding.ObservableInt
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import javax.inject.Inject

class MainViewModel @Inject constructor() {
    var likes = ObservableInt()

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        likes.set(5)
    }

    fun onClick() {
        likes.set(likes.get() + 1)
    }
}