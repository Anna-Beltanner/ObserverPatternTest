package com.example.observerpatterntest

import android.util.Log

data class User(val name: String, val surname: String) : UserAction {

    private val TAG = User::class.java.simpleName

    override fun getClothes(degrees: Int) {

        if (degrees > 50) {
            Log.e(TAG, "warm")
        } else {
            Log.e(TAG, "cold")
        }

    }

}