package com.example.myapplication.observerpattern

import java.util.*

/**
 * 被观察者
 */
class DevTechFrontier : Observable() {

    fun postNewPublication(content: String) {
        setChanged()

        notifyObservers(content)
    }
}