package com.example.observerpatterntest

import android.os.Handler
import java.util.*


class WeatherStation {

    private val people: MutableList<UserAction> = LinkedList()

    var degrees = 0

    fun addUser(userAction: UserAction) {
        people.add(userAction)
    }

    fun removeUser(userAction: UserAction) {
        people.remove(userAction)
    }

    fun changeWeather() {

        degrees = Random().nextInt(100)
        people.forEach {
            it.getClothes(degrees = degrees)
        }

        val handler = Handler()
        handler.postDelayed(
            {
                changeWeather()
            }, 2000
        )


    }
}