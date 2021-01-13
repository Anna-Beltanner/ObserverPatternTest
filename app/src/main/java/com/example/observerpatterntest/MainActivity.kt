package com.example.observerpatterntest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherStation = WeatherStation()

        weatherStation.addUser(User(name = "Harry", surname = "Potter"))
        weatherStation.addUser(User(name = "Ron", surname = "Weasley"))
        weatherStation.addUser(User(name = "Hermione", surname = "Granger"))
        weatherStation.addUser(User(name = "Albus", surname = "Dumbledore"))
        weatherStation.addUser(User(name = "Severus", surname = "Snape"))
        weatherStation.addUser(User(name = "Lord", surname = "Voldemort"))
        weatherStation.addUser(User(name = "Colin", surname = "Creevey"))
        weatherStation.addUser(User(name = "Remus", surname = "Lupin"))
        weatherStation.addUser(User(name = "Sirius", surname = "Black"))

        weatherStation.changeWeather()




    }
}